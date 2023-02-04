package com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumGridPractice {
	
	WebDriver dr;
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		 dr=  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	}
	public void test2() throws MalformedURLException {
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setBrowserName("Fairefox");
		cap.setPlatform(Platform.WIN10);
		 dr=  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	}

}
