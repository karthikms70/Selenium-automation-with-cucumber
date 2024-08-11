package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//form/div[3]/button")
	WebElement loginBtn;
	
	
	public void doLogin(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginBtn.click();
		
	}
	
	public void openSite() {
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	

}
