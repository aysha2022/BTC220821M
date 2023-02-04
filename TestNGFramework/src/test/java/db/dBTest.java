package db;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import db1.dataDivenTest;

public class dBTest {
	@DataProvider
	
	
	@Test(dataProviderClass=dataDivenTest.class,dataProvider="login")//that help to perform data driven testing from extranal resourses
	//double dimension array run test cases more than onetime
	  public void f(Integer n, String s) {
	  }

}
