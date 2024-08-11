package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage{

	@FindBy(xpath = "//a[text()='Apply']")
	WebElement apply;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement lvTypeDrpdwn;
	
	@FindBy(xpath = "//span[text()='CAN - FMLA']")
	WebElement lvType;
	
	
	@FindBy(xpath = "//div[@class='oxd-date-wrapper']//i")
	List<WebElement> date;
	
	@FindBy(xpath = "//ul/li[@class='oxd-calendar-selector-month']")
	WebElement frmDate;
	
	@FindBy(xpath = "//li[@class='oxd-calendar-dropdown--option'][text()='September']")
	WebElement frmMonth;
	

	@FindBy(xpath = "//div[@class='oxd-calendar-date'][text()='3']")
	WebElement frmDay;
	
	
	public void selectDates() {
		apply.click();
		date.get(0).click();
		frmDate.click();
		frmMonth.click();
		frmDay.click();
		
	}
	
}
