package com.bit.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import db.DbTest2;
import dev.failsafe.internal.util.Assert;

public class SmokeTest extends BaseTest{
	@Test(groups="ui",dataProviderClass = DbTest2.class, dataProvider = "login")
	public void login(Object o, Object o1) {
		System.out.println(o);
		System.out.println(01);
		System.out.println("test1");
		Assert.assertTrue(8>6);
	}
	
	@Test(groups="db")
	public void dbValidation() {
		System.out.println("test1");
	Reporter.log("Test1");
	
	}

	
	  
}
