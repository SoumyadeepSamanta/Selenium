package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Logging in");
	}
	@Test
	void search()
	{
		System.out.println("Search method");
	}
	@Test
	void advSearch()
	{
		System.out.println("Advanced search method");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logging out");
	}
  
}
