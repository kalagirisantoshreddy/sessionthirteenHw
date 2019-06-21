package HW_Rough;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Cookies_By_Name {

	public static void  main (String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		//driver.manage().deleteAllCookies();
		Set<Cookie> cookiesCollection = driver.manage().getCookies();
		for (Cookie cookie : cookiesCollection) {
			System.out.println("name of cookie :-" + cookie.getName());
		}

		System.out.print("number of cookies: " + cookiesCollection.size() + "");
		
		driver.manage().deleteCookieNamed("RuW");
		driver.manage().deleteCookieNamed("_ga");
		driver.manage().deleteCookieNamed("__gads");
		driver.manage().deleteCookieNamed("_gid");
		
		Set<Cookie> cookiessCollection = driver.manage().getCookies();
		for (Cookie cookie : cookiessCollection) {
	//		System.out.println("name of cookie :-" + cookie.getName());
		}

		System.out.print("number of cookies: " + cookiessCollection.size() + "");
		
		
		 // In this example we are passing, name=mycookie and value=123456789123
		Cookie name = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(name);
		
                // After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		
	
		
		driver.quit();

		}

	}




}
