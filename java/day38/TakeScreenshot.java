package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
//		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
//		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
//		sourceFile.renameTo(targetFile);
		
		WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourceFile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourceFile.renameTo(targetFile);

	}

}
