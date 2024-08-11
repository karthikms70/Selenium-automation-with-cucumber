package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage {

	@FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	WebElement userRole;
	
	@FindBy(xpath = "//div[@class='oxd-select-option']/span[text()='Admin']")
	WebElement admin;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement srchBtn;
	
	@FindBy(xpath = "//div[@class='oxd-table-card']")
	List<WebElement> adminList;
	
	public boolean findAdminCount() throws InterruptedException {
		
		userRole.click();
		Thread.sleep(2000);
		admin.click();
		srchBtn.click();
		if(adminList.size()>=1) return true;
		
		return false;
		
	}
	
}
