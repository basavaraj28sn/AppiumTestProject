package Appium;

import org.testng.annotations.Test;

public class Test_contacts extends App_Contacts_Launch {

	@Test
	public void callfromphone()
	{
		aDriver.findElementByAccessibilityId("android:id/input").sendKeys("Home");
	}

}
