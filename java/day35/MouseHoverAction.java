package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
		WebElement spvc=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Self Paced Video Course')]"));
		WebElement scc=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Selenium Course Curriculum']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(spvc).moveToElement(scc)./*click()*/build().perform();

	}

}
