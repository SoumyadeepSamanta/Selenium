package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[@id='dblclick']"));
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();

	}

}
