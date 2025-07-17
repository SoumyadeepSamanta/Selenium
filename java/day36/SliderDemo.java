package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// Min
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//div//span[1]"));
		System.out.println("Before location "+min_slider.getLocation());
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("After location "+min_slider.getLocation());
		
		// Max
		WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//div//span[2]"));
		System.out.println("Before location "+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -100, 250).perform();
		System.out.println("After location "+max_slider.getLocation());


	}

}
