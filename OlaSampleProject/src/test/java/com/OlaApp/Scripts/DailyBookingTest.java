package com.OlaApp.Scripts;

import org.testng.annotations.Test;

import com.olaApp.lib.BaseLib;
import com.olaApp.pages.DailyRidesDestinationPage;
import com.olaApp.pages.LandingPage;
import com.olaApp.pages.PickUpPage;

public class DailyBookingTest extends BaseLib{
	
	@Test
	public void tc_001_CreateDailyBooking() throws InterruptedException {
		LandingPage  landingPage = new LandingPage(gv.driver);
		landingPage.tapOnTxtFldPickUp();
		PickUpPage pickupPage = new PickUpPage(gv.driver);
		pickupPage.selectHomeFav();
		Thread.sleep(3000);
		landingPage.tapOnTxtFldDrop();
		Thread.sleep(3000);
		DailyRidesDestinationPage dailyDestPage = new DailyRidesDestinationPage(gv.driver);
		dailyDestPage.selectFirstRecentDestination();
		Thread.sleep(3000);
		dailyDestPage.tapBookBtn();
	}
	
	
	
}
