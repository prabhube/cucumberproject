package com.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Bass_class;
import com.baseclass.Pompage;
import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Bass_class {
	public static WebDriver driver=RunnerClass.driver;
	public static Pompage p;
//	@Given("user able to launch the browser")
//	public void user_able_to_launch_the_browser() {
//		
//	   geturl("https://adactinhotelapp.com/");
//	   
//	}
//
//	@When("user able to write the username")
//	public void user_able_to_write_the_username() {
//		 p=new Pompage(driver);	
//	   Input(p.getUsername(), "prabhube");
//	}
//
//	@When("user able to write the password")
//	public void user_able_to_write_the_password() {
//	  
//	   Input(p.getPassword(), "Kasthuriraja1!");
//	}
//
//	@Then("user able to login page")
//	public void user_able_to_login_page() {
//	   WebElement login = driver.findElement(By.id("login"));
//	   click(login);
//	}

@Given("user able to launch the browser")
public void user_able_to_launch_the_browser() {
   geturl("https://adactinhotelapp.com/");
}
@When("user able to write the username")
public void user_able_to_write_the_username() {
   p=new Pompage(driver);
   Input(p.getUsername(), "prabhube");
}
@When("user able to write the password")
public void user_able_to_write_the_password() {
	Input(p.getPassword(),"Kasthuriraja1!");
}
@Then("user able to login page")
public void user_able_to_login_page() {
	 WebElement login = driver.findElement(By.id("login"));
	   click(login);
}


	
}
