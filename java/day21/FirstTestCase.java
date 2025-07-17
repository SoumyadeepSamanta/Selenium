package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 Test Case
 1. Launch browser
 2. Open URL https://demo.opencart.com/
 3. Validate title should be "Your Store"
 4. Close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1. Launch the browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2. Open URL https://demo.opencart.com/
		driver.get("https://demo.nopcommerce.com/");
		
		// 3. Validate title should be "Your Store"
		String act_title=driver.getTitle();
		
		if(act_title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// 4. Close browser
		driver.close();
//		driver.quit();
		
	}

}
