package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Bass_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prem\\eclipse-workspace\\cucumberproject\\src\\test\\java\\com\\feature\\Adacitin.feature",
glue="com.stepsefinition")

public class RunnerClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\cucumberproject\\Driver\\chromedriver.exe");
//			WebDriver driver=new ChromeDriver();
		driver=Bass_class.browserLaunch("chrome");
	
	}
	
}
