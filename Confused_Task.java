package HW_Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*In the above table along with company name we have company's previous close(third column) and the current price (fourth column). 

These details are shown again in the details page when you click on the link(first cell).

Your task is to verify these details if they are same on this page to when you go to details page.

1). Get number of rows
2). Get number of columns
3). Use xpath pattern for rows and columns to iterate through the rows
4). For each row, take the values of previous close and current close into local variables
5). Click on first cell, this will take you to next page
6). Read the current close and previous close in the details page
7). Compare the values takes in step 4 and step 6. If they are not same, printout the company name.
8). Go back to previous page*/
public class Confused_Task {
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
				System.out.print(clm.getText());

			}

			System.out.println(index);

		}

		driver.quit();

	}

}


