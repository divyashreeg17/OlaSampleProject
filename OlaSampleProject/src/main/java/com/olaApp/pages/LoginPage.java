package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/continue_with_phone_number")
	private MobileElement continueWithContNum;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/google_login_btn")
	private MobileElement continueWithGmail;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/fb_login_btn")
	private MobileElement continueWithFB;
	
	@AndroidFindBy(accessibility = "090357 35320")
	private MobileElement contactNum;
	
	@AndroidFindBy(id ="com.olacabs.customer:id/allow_permission")
	private MobileElement btnAllowPermissions;
	
	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void tapOnContinueWithPhoneNum() {
		continueWithContNum.click();
	}
	
	public void tapOnGoogle() {
		continueWithGmail.click();
	}
	
	public void tapOnFB() {
		continueWithFB.click();
	}
	
	public void tapOnContactNum() {
		contactNum.click();
	}
	
	public void tapAllowPermissions() {
		btnAllowPermissions.click();
	}

}
