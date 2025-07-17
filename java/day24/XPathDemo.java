package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// xpath with single attribute
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Protein Powder");
		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// xpath with multiple attributes
		driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Protein Powder");
		
		// xpath with and or operator
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("Protein Powder");
		
		// xpath with inner text
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		// contains and starts with
		
	}

}
