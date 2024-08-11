package com.automation.tesing;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.automation.utils.ConfigProp;

public class LoginTest extends BaseTest {

	@Test
	public void verifyUserCanLogin() throws InterruptedException  {
		
		//login
		login.openSite();
		login.doLogin(ConfigProp.getData("username"),ConfigProp.getData("password"));
		
		//click on admin
		hmp.clickAdmin();
		
		assertTrue(admP.findAdminCount());
	}
	
}
