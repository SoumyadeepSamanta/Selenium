package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		List<String> windowList=new ArrayList(windowIds);
		
		String parentId=windowList.get(0);
		String childId=windowList.get(1);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		
		// or
		for(String winId:windowIds)
		{
			String title=driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
