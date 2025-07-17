package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		List<String> windowList=new ArrayList(windowIds);
		
		for(String winId:windowIds)
		{
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM"))
			{
				Thread.sleep(4000);
				driver.close();
			}
		}
		
		

	}

}
