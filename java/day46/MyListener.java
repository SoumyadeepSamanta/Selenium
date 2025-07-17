package day46;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	  public void onStart(ITestResult result) {
		    // not implemented
		  System.out.println("Test execution is started");
	  }
	 
	  public void onTestStart(ITestResult result) {
	    // not implemented
		  System.out.println("Test started");
	  }

	  
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  System.out.println("Test passed");
	  }

	  
	  public void onTestFailure(ITestResult result) {
	    // not implemented
		  System.out.println("Test failed");
	  }

	  public void onTestSkipped(ITestResult result) {
	    // not implemented
		  System.out.println("Test skipped");
	  }


}
