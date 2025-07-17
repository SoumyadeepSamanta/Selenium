package day43.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C3 {
  @Test
  public void pqr() {
	  System.out.println("This is pqr from C3");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is BeforeSuite method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is AfterSuite method");
  }

}
