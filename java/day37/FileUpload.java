package day37;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		driver.manage().window().maximize();
		
		// Single file upload
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Soumyadeep\\Downloads\\Test Summary Report.docx");
//		System.out.println(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText());
		
		// Multiple files
		String file1="C:\\Users\\Soumyadeep\\Downloads\\Test Summary Report.docx";
		String file2="C:\\Users\\Soumyadeep\\Downloads\\Master_Test_Plan_Library_UI.docx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		List<WebElement> files=driver.findElements(By.xpath("//ul[@id='fileList']//li"));
		int noOfFiles=files.size();
		System.out.println(noOfFiles);
		
	}

}
