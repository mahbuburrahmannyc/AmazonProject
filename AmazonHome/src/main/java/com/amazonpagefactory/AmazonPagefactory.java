package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPagefactory {
	
	private String url="https://www.amazon.com/";
    private String uname="mmrsd2k@gmail.com";
    private String upass="test1234";
    
    
	@FindBy(xpath="(//*[@class='nav-line-1'])[3]")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@type='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement UserPassword ;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement clickButton;
	
	
	
	public String getUrl() {
		return url;
	}


	public WebElement getSignIn() {
		return SignIn;
	}


	public String getUname() {
		return uname;
	}


	public WebElement getUserName() {
		return UserName;
	}


	public String getUpass() {
		return upass;
	}


	public WebElement getUserPassword() {
		return UserPassword;
	}


	public WebElement getClickButton() {
		return clickButton;
	}
	
	
	
	

}
