package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazonpagefactory.AmazonPagefactory;

public class GenericClass {
	
                       WebDriver driver;
	                   AmazonPagefactory pf;
	
public void getSetup(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumon\\eclipse-workspace\\AmazonHome\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
    pf=PageFactory.initElements(driver, AmazonPagefactory.class);
    driver.get(pf.getUrl());
	driver.manage().window().maximize();
	
}

public void signIn() {
	pf.getSignIn().click();
	pf.getUserName().sendKeys(pf.getUname());
	pf.getUserPassword().sendKeys(pf.getUpass());
	pf.getClickButton().click();
	
	
	
}

public void loginVerification() {
	if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
		
		System.out.println("Test Pass");
	}
	else {
		
		System.out.println("Test Fail");
//System.out.println(driver.getTitle());
	}
}

public void logInValidation() {
	
	Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	System.out.println("Test Pass");// string and string Assert.assertEquals from TestNG
	//Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
}

public void tearDown() {
	
	driver.quit();
	
	
}


}//End of Class
