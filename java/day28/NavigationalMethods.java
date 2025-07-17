package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 
		// String
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		// URL object
//		URL myUrl = null;
//		try {
//			myUrl = new URL("https://demo.nopcommerce.com/");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		driver.navigate().to(myUrl);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		

	}

}
