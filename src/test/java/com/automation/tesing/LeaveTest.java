package com.automation.tesing;

import org.testng.annotations.Test;

import com.automation.utils.ConfigProp;

public class LeaveTest extends BaseTest {

	@Test
	public void verifyLeaveApplied() {
		//login
		login.openSite();
		login.doLogin(ConfigProp.getData("username"),ConfigProp.getData("password"));
		
		
		//leave 
		hmp.clickLeave();
		//select date
		lvp.selectDates();
		
	}
	
}
