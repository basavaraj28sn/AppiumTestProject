package Appium;

import org.testng.annotations.Test;

public class Method_ScrollTo extends App_DemoApp_Launch{

	@Test
	public void scrollIntoView() throws InterruptedException
	{
		Thread.sleep(1000);
		aDriver.findElementByAccessibilityId("Views").click();
		Thread.sleep(1000);
		aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))").click();
	}	
}
