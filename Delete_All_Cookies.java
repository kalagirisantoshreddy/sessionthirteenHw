package HW_Rough;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_All_Cookies {
	
	public static void  main (String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().deleteAllCookies();
		Set<Cookie> cookiesCollection = driver.manage().getCookies();
		for (Cookie cookie : cookiesCollection) {
			System.out.println("name of cookie :-" + cookie.getName());
		}

		System.out.print("number of cookies: " + cookiesCollection.size() + "");
		driver.quit();

		}

	}


