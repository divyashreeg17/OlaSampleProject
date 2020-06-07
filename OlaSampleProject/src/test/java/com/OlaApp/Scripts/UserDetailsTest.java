package com.OlaApp.Scripts;

import org.testng.annotations.Test;

import com.olaApp.lib.BaseLib;
import com.olaApp.pages.LandingPage;
import com.olaApp.pages.MenuPage;
import com.olaApp.pages.ProfilePage;
import com.olaApp.pages.UserDetailsPage;

public class UserDetailsTest extends BaseLib{
	@Test
	public void tc_001_verifyMailIdUpdation() {
		LandingPage landingPage = new LandingPage(gv.driver);
		landingPage.openMenu();
		MenuPage menuPage = new MenuPage(gv.driver);
		menuPage.openProfile();
		ProfilePage profilePage = new ProfilePage(gv.driver);
		profilePage.openUserDetails();
		UserDetailsPage userDetailsPage = new UserDetailsPage(gv.driver);
		userDetailsPage.openMailIdDetails();

	}
	
}
