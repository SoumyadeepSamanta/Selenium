package day43.pack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class C2 {
  @Test
  public void xyz() {
	  System.out.println("This is xyz from C2");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("This is AfterTest method");
  }

}
