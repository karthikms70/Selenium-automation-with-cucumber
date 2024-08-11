package com.automation.tesing;

import org.testng.annotations.BeforeMethod;

import com.automation.pages.AdminPage;
import com.automation.pages.HomePage;
import com.automation.pages.LeavePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigProp;
import com.automation.utils.DriverManager;


public class BaseTest {
	
	LoginPage login;
	HomePage hmp;
	AdminPage admP;
	LeavePage lvp;
	@BeforeMethod
	public void setUp() {
		DriverManager.createDriver();
		ConfigProp.configData();
		login=new LoginPage();		
		hmp=new HomePage();
		admP=new AdminPage();
		lvp=new LeavePage();
	}
	

}
