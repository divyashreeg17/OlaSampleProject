package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/viewClickableUserDetails")
	private MobileElement userDetails;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/corporate_parent")
	private MobileElement corporateProfile;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/textFavouriteLocations")
	private MobileElement favouriteLocations;
	
	public ProfilePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void openUserDetails() {
		userDetails.click();
	}
	
	public void openCorporateProfile() {
		corporateProfile.click();
	}
	
	public void openFavoriteLocations() {
		favouriteLocations.click();
	}
	

}
