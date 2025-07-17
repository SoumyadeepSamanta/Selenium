package day43.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class C1 {
  @Test
  public void abc() {
	  System.out.println("This is abc from C1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is BeforeTest method");
  }

}
