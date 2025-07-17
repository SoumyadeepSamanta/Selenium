package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isDisplayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		// isEnabled
		System.out.println(driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled());
		
		// isSelected
		System.out.println(driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected());

	}

}
