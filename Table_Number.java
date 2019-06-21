package HW_Rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myWebDriver = null;
		myWebDriver = new ChromeDriver();
		myWebDriver.manage().window().maximize();
		myWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// webTableExample(myWebDriver);
		int rowNumber = getRowNumberByCellText(myWebDriver, "245.95");
		// System.out.println(rowNumber);
	}

	private static int getRowNumberByCellText(WebDriver driver, String cellText) {
		String url = "https://money.rediff.com/gainers";
		driver.get(url); // navigate to the target url

		try {
			List<WebElement> element = driver.findElements(By.cssSelector("tr"));

			int row = 0;

			for (WebElement w : element) {

				String elemText = w.getText();

				CharSequence celltext = "245.95";

				if (elemText.contains(celltext)) {

					w.click(); // do something with the element

					System.out.println("The cell Text in row " + row + " was " + celltext + " so returning it!");
				}

				row++;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}

		return -1;
	}
}