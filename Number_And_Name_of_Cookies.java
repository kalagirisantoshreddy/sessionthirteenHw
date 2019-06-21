package HW_Rough;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_And_Name_of_Cookies {

	/*
	 * 1). Get the list of cookies 
	 * 2). Print number of cookies 
	 * 3). Print each cookie
	 * name 
	 * 4). Delete each cookie by name 
	 * 5). Get all cookies again 
	 * 6). Print
	 * number of cookies
	 * 
	 * 
	 */
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver myWebDriver = null;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://portfolio.rediff.com/portfolio-login");
		Set<Cookie> cookiesCollection = driver.manage().getCookies();
		for (Cookie cookie : cookiesCollection) {
			System.out.println("name of cookie :-" + cookie.getName());
		}

		System.out.print("number of cookies: " + cookiesCollection.size() + "");
		driver.quit();

		}
	}
