package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/profile_icon")
	private MobileElement btnmenu;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/pickup")
	private MobileElement txtFieldPickup;
	
	@AndroidFindBy(id="com.olacabs.customer:id/img_fav")
	private MobileElement imageFav;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/bg_highlight")
	private MobileElement txtFieldDrop;
	
	@AndroidFindBy(accessibility = "Daily")
	private MobileElement tabDaily;
	
	@AndroidFindBy(accessibility = "Rentals")
	private MobileElement tabRentals;
	
	@AndroidFindBy(accessibility = "Outstation")
	private MobileElement tabOutstation;
	
	@AndroidFindBy(accessibility = "Drive")
	private MobileElement tabDrive;
	
	public LandingPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public void openMenu() {
		btnmenu.click();
	}
	
	public void tapOnTxtFldPickUp() {
		txtFieldPickup.click();
	}
	
	public void tapOnImgFav() {
		imageFav.click();
	}
	
	public void tapOnTxtFldDrop() {
		txtFieldDrop.click();
	}
	
	public void selectDaily() {
		tabDaily.click();
	}
	
	public void selectRentals() {
		tabRentals.click();
	}
	
	public void selectOutstation() {
		tabOutstation.click();
	}
	
	public void selectDrive() {
		tabDrive.click();
	}
	
}
