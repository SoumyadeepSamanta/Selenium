package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> searchResults=new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a")));
		
		for(WebElement element:searchResults)
		{
			String link=element.getAttribute("href");
			System.out.println(element.getText()+"->"+link);
			element.click();
			
		}
		
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println("Switching to each browser window and getting the titles........"); 
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		driver.quit();

	}

}
