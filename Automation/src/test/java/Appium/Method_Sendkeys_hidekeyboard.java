package Appium;

import org.testng.annotations.Test;

public class Method_Sendkeys_hidekeyboard extends App_DemoApp_Launch{
	@Test
	public void view() throws InterruptedException
	{
		Thread.sleep(1000);
		aDriver.findElementByAccessibilityId("Views").click();
		Thread.sleep(1000);
		aDriver.findElementByAccessibilityId("Controls").click();
		aDriver.findElementByAccessibilityId("3. Holo Light Theme").click();
		aDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("basavaraj");
		Thread.sleep(3000);
		aDriver.hideKeyboard();
	}
}
