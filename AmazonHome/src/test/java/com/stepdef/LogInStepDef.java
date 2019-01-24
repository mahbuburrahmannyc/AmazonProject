package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonpagefactory.AmazonPagefactory;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDef {
	
	WebDriver driver;
	AmazonPagefactory pf;
	
	
	@Given("^User on Amazon Home page$")
	public void user_on_Amazon_Home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumon\\eclipse-workspace\\AmazonHome\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	    pf=PageFactory.initElements(driver, AmazonPagefactory.class);
	    driver.get(pf.getUrl());
		driver.manage().window().maximize();
		
		
	    
	}

	@When("^User click sign in$")
	public void user_click_sign_in() throws Throwable {
	   
		pf.getSignIn().click();
	    
	}

	@When("^User enter UserName$")
	public void user_enter_UserName() throws Throwable {
	   
		pf.getUserName().sendKeys(pf.getUname());
	}

	@When("^User enter Password$")
	public void user_enter_Password() throws Throwable {
	   
		pf.getUserPassword().sendKeys(pf.getUpass());
	    
	}

	@When("^User Click signIn Button$")
	public void user_Click_signIn_Button() throws Throwable {
	   
		pf.getClickButton().click();
	}

	@Then("^User Successfully LogIn$")
	public void user_Successfully_LogIn() throws Throwable {
		
		if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
			
			System.out.println("Test Pass");
		}
		else {
			
			System.out.println("Test Fail");
	//System.out.println(driver.getTitle());
		}
	   
	    
	}


}
