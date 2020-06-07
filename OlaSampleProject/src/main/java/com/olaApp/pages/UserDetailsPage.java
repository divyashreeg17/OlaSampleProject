package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserDetailsPage {
	
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/details_parent")
	private MobileElement mailIdDetails;
	
	public UserDetailsPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void openMailIdDetails() {
		mailIdDetails.click();
	}
	
}
