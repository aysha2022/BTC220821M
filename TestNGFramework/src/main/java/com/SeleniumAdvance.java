package com;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v104.network.model.Cookie;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumAdvance {

	    WebDriver driver;
	    WebElement element;

	    public void seleniumTest(){
	        driver.close();
	        WebElement element = driver.findElement(By.id("id"));
	        element.clear();
	        element.click();
	        element.findElement(By.xpath("gjyt"));
	        element.getAttribute("id");
	        element.sendKeys("firstName");
	        element.sendKeys(Keys.ARROW_UP);
	        element.getLocation().getX(); // to handle rectangle
	        element.getRect().getHeight();// to get height
	        element.getScreenshotAs(OutputType.FILE); // to take screen shots
	        int v = element.getSize().height;
	        element.getTagName();
	        element.getText();
	        element.isDisplayed();
	        element.isEnabled();
	        element.isSelected();
	        element.submit(); // looks like click same work

	        List<WebElement> elements = driver.findElements(By.tagName("a"));
	        elements.size();

	        driver.get("");
	        driver.getTitle();
	        driver.getCurrentUrl();
	        driver.getWindowHandle(); // to grab parent window
	        Set<String> s = driver.getWindowHandles();  // to grab child window
	        WebDriver.Options opt = driver.manage();
	        opt.addCookie(new Cookie("","")); // under Options all cookie related method
	        Set<Cookie> cookies = opt.getCookies();
	        opt.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        		 opt.timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
	        opt.timeouts().setScriptTimeout(34,TimeUnit.SECONDS);

	        opt.window().maximize();
	        opt.window().fullscreen();

	        WebDriver.Navigation nav = driver.navigate();
	        nav.back();
	        nav.forward();
	        nav.refresh();
	        nav.to("");

	        driver.quit();

	        WebDriver.TargetLocator tr = driver.switchTo();

	        tr.activeElement();
	        tr.defaultContent(); // to back to main page
	        tr.frame(3);
	        tr.frame("frameName");
	        tr.frame("element");

	        Alert al = tr.alert();
	        al.accept();
	        al.dismiss();
	        al.sendKeys("jfs");
	        al.getText();
	        // to handle customize alert box or window based alert box. we need third tools autoIT, Sikuli,robortAPI,

	    }

	    public void selectFromDropdown(){

	        Select select = new Select(driver.findElement(By.xpath("ele")));

	        select.selectByIndex(0);
	        select.selectByValue("Value");
	        select.selectByVisibleText("January");
	        int sizeOfDropdown =  select.getOptions().size();

	        for (int i = 0; i<sizeOfDropdown;i++){
	            select.selectByIndex(i);
	        }
	    }

	    public  void mouseHandle(){
	        Actions actions = new Actions(driver);
	        // before performing we need to use build and perform  method
	        actions.click();
	        actions.clickAndHold();
	        actions.clickAndHold(null);
	        actions.contextClick().build().perform();
	        actions.doubleClick();
	        actions.dragAndDrop(element,element);
	        actions.dragAndDropBy(element,100,150).build().perform();
	        actions.keyDown(Keys.ARROW_UP);
	        actions.moveToElement(element).build().perform();
	        actions.pause(2).release();
	        actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"p");
	    }

	    public void  multipleWindowHandle(){

	        String parentWindow  = driver.getWindowHandle();

	        Actions actions = new Actions(driver);
	        actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	        Set<String> childWindow = driver.getWindowHandles();
	        for (String win : childWindow){
	            if(!win.equals(parentWindow)){
	                driver.switchTo().window(win);
	                driver.findElement(By.id("id")).click();
	                break;
	            }
	        }
	        driver.switchTo().defaultContent();
	    }

	    public void handleDynamicFrame(String frameValue)
	    {
	       List<WebElement> allFrames =driver.findElements(By.tagName("iframe"));
	       for (WebElement frame : allFrames){
	           if (frame.getAttribute("class").equals(frameValue)){
	               driver.switchTo().frame(frameValue);
	           }
	       }

	    }

	    public void takeScreenshot() throws IOException {
	        File  file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(file, new File("filePath"));
	    }

	    public void  javaScriptExecutor(){
	        JavascriptExecutor js = (JavascriptExecutor)element;
	        js.executeScript("document.getElementById('id').click()");
	    }

	


}
