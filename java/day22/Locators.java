package day22;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		System.out.println(driver.findElement(By.id("login-button")).getText());
		driver.findElement(By.id("login-button")).click();
		
//		driver.findElement(By.className("shopping_cart_container")).click();
		
//		driver.findElement(By.id("item_4_title_link")).click();
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
		
//		WebElement searchButton=driver.findElement(By.className("button-1 search-box-button"));
//		searchButton.click();
		
//		WebElement logo=driver.findElement(By.className("header-logo"));
//		boolean status=logo.isDisplayed();
//		
//		System.out.println(status);
		
		// linkText and partialLinkText
//		driver.findElement(By.className("/ico-wishlist")).click();
		
		//Many web elements ---> returns list
		List<WebElement> headerLinks=new ArrayList<>();
		headerLinks=driver.findElements(By.className("inventory_container"));
		System.out.println(headerLinks.size());

		//tags
		List<WebElement> links=new ArrayList<>();
		links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		System.out.println(driver.findElements(By.tagName("img")).size());

	}

}
