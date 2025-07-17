package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggableElement']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppableElement']"));
		
		act.dragAndDrop(drag, drop).build().perform();

	}

}
