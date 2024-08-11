package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//nav/div[2]/ul/li[1]/a")
	WebElement adminbtn;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leave;
	
	public void clickAdmin() {
		adminbtn.click();
	}
	
	public void clickLeave() {
		leave.click();
	}
	
	
}
