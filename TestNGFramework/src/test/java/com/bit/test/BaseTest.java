package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	
  @Parameters
  @BeforeMethod
  public void Start(String b) {
	  if(b.equals("chrome")){
		  System.out.println("open browser");
	  }else if(b.equals("fairefox")) {
		  System.out.println("open fairfox");
	  }
	  
  }
  public void beforeMethod() {
	  System.out.println("BM");
  }

  @AfterMethod(alwaysRun =true)
  public void afterMethod() {
	  System.out.println("AM");
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Ac");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BT");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("At");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS");
  }
  }


