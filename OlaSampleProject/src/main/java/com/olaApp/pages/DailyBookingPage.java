package com.olaApp.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DailyBookingPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/ride_mode")
	private MobileElement rideMode;
	
	@AndroidFindBy(id = "android:id/numberpicker_input")
	private List timePicker;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/time_picker")
	private List datePicker;
	
	public DailyBookingPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void scheduleRideOn(String date, int hour, int min, String ampm) {
		
	}
}
