package day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	void openApp()
	{
		System.out.println("Opening application");
	}
	@Test(priority=2)
	void Login()
	{
		System.out.println("Logging in");
	}
	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logging out");
	}

}
