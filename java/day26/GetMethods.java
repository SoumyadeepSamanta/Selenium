package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		// WindowIds of multiple pages
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIds=driver.getWindowHandles();
		for(String s:windowIds)
		{
			System.out.println(s);
		}
		
		

	}

}
