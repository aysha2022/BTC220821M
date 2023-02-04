package db1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

public class BaseLestiner implements ITestListener{

	
	
	  		WebDriver dr;
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        	System.out.println(arg0.getName()+" Is finshed ");	
	    }		
	
	    		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        	System.out.println(arg0.getName()+" Is Started ");	
	
	    }		

	    		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				

  }		
  public void onTestFailure(ITestResult arg0) {					
      // TODO Auto-generated method stub				
  	if(arg0.getStatus()==ITestResult.FAILURE) {
      	System.out.println(arg0.getName()+" ScreemShot of faliure ");      	
   	}
   }		
   	
   public void onTestSkipped(ITestResult arg0) {					
  // TODO Auto-generated method stub				
 	if(arg0.getStatus()==ITestResult.SKIP) {
       	System.out.println(arg0.getName()+" Is skiped ");
     	
 	}
    }		

   	
    public void onTestStart(ITestResult arg0) {					
       // TODO Auto-generated method stub				
       	System.out.println(arg0.getName()+ " IS Started ");	
   }		

	
   public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	if(arg0.getStatus()==ITestResult.SUCCESS) {
        	System.out.println(arg0.getName()+" Is Success");
     
        	try {
				ScreenShot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
}
		
}		

public void ScreenShot() throws IOException {
TakesScreenshot scrShot =((TakesScreenshot)dr);//Take screen shot is interface Call getScreenshotAs method to create image file

       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

    //Move image file to new destination
File DestFile=new File("/Users/bittech/Desktop/BTC07312021M/TestNGProject2106/SreenShot");

        //Copy file at destination

        Files.copy(SrcFile, DestFile);


}


public void SaPrac() {

SoftAssert s = new SoftAssert();
s.assertTrue(3>5);
s.assertFalse(3<5);
s.assertAll();// thru assert all it will grab all the assert with Unmatch condition

        	
    }
d      v             
}
