package Appium;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class SelectValueDropDown extends App_DemoApp_Launch{
	
	@Test
	public void dropdownlist() throws InterruptedException
	{
		aDriver.findElementByAccessibilityId("Views").click();
		aDriver.findElementByAccessibilityId("Controls").click();
		aDriver.findElementByAccessibilityId("2. Dark Theme").click();
	
		aDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("Test");
		aDriver.hideKeyboard();
		
		aDriver.findElementById("android:id/text1").click();
		Thread.sleep(3000);
	
		//aDriver.findElementByName("Mars").click();   
		aDriver.findElementByXPath(
		"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[4]").click();
	}
}
