package com.OlaApp.Scripts;

import org.testng.annotations.Test;

import com.olaApp.lib.BaseLib;
import com.olaApp.pages.LoginPage;

public class LoginTest extends BaseLib{
	
	@Test
	public void tc_001_loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(gv.driver);
		loginPage.tapOnContinueWithPhoneNum();
		loginPage.tapOnContactNum();
		Thread.sleep(30000);
		loginPage.tapAllowPermissions();
		Thread.sleep(3000);
	}
	
}
