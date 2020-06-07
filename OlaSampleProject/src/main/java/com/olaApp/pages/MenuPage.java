package com.olaApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id = "com.olacabs.customer:id/user_pic")
	private MobileElement userImg;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup")
	private MobileElement profile;
	@AndroidFindBy(id = "com.olacabs.customer:id/item_name")
	private MobileElement userName;
	
	public MenuPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void openProfile() {
		profile.click();
	}
	
	
}
