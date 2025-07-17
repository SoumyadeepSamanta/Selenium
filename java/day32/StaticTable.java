package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("No of rows:"+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println("No of cols:"+cols.size());
		
		// Read date from a specific row specific column
		WebElement specific=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		System.out.println(specific.getText());
		
		//Read data from all rows and columns
		for(int i=2;i<rows.size();i++)
		{
			for(int j=1;j<cols.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText()+"\t");
			}
			System.out.println();
		}
		
		int total=0;
		for(int i=2;i<rows.size();i++)
		{
			total=Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText());
			System.out.println(total);
		}

	}

}
