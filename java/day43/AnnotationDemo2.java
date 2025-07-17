package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("Logging out");
	}
}
