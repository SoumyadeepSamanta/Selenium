package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(checkboxes.size());
		
		for(WebElement e:checkboxes)
		{
			e.click();
		}
	}

}
