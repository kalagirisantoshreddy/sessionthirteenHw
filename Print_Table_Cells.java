package HW_Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Table_Cells {

	/*
	 * Print table cells: 1). Go to table 2). Iterate through each row 3). Iterate
	 * through each cell in the row 4). Print each cell. - All the cells belonging
	 * to one row should be printed in one line
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> rowsUsingXpath = driver.findElements(By.xpath("/html/body/div[1]/div[5]/table/tbody/tr"));
		int numberOfTags = rowsUsingXpath.size();
		System.out.println("Total number of rows are: " + rowsUsingXpath.size());

		for (int index = 0; index < numberOfTags; index++) {

			WebElement row = rowsUsingXpath.get(index);
			List<WebElement> clms = row.findElements(By.tagName("td"));
			for (int coulmIndex = 0; coulmIndex < clms.size(); coulmIndex++) {
				WebElement clm = clms.get(coulmIndex);
				System.out.print(" | "+ clm.getText());
			}

			System.out.println(index+" | ");
		}
	driver.quit();
	}

}