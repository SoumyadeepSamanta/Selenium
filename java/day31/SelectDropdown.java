package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
//		drpCountry.selectByVisibleText("France");
//		drpCountry.selectByValue("japan");
		drpCountry.selectByIndex(5); // Count manually
		
		// Capture all options from dropdown
		List<WebElement> options=drpCountry.getOptions();
		System.out.println(options.size());
		
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}

	}

}
