package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DailyRidesDestinationPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/bg_highlight")
	private MobileElement enterDestination;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]")
	private MobileElement firstRecent;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/btn_book")
	private MobileElement btnBook;
	
	public DailyRidesDestinationPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void tapBookBtn() {
		btnBook.click();
	}
	
	public void selectFirstRecentDestination() {
		firstRecent.click();
	}

}
