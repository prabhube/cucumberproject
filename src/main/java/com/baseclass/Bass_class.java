package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bass_class {

	
	public static WebDriver driver;
//	public static String value;
	static long timeOuts = 30;
	
	public static WebDriver browserLaunch(String type) {
		if(type.equalsIgnoreCase("chrome"))
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\cucumberproject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","");
			driver= new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
	return driver; 
		
}
	//url
	public static void geturl(String url) 
	{
		driver.get(url);
	}
	
	//inspect and sendkeys and action
	public static void Input(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Inputkeys(WebElement element,String value,String key) {
		element.sendKeys(value, key);
	}
	  
	//click
		public static void click(WebElement element) {
			element.click();
		}
		
	
		
		
		
	// javascript scrollup and scroll down
		//  clickJavaScript
		public static void clickJavaScript(WebElement target) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", target);
		}

		// scrollup
		public static void scrollUpJavaScript(WebElement target) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", target);
		}

		// scrolldown
		public static void scrollDownJavaScript(WebElement target) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", target);
		}

		
		// quit
		public static void quit() {
			driver.quit();
			}
		//close
		public static void close() {
			driver.close();
			}

}
