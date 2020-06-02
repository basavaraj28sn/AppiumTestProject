package Appium;

import org.testng.annotations.Test;

public class Method_Andriod_UIAutomator extends App_Cal_Launch {

	@Test
	public void view() throws InterruptedException
	{
		//aDriver.findElementByAndroidUIAutomator("text(\"9\")").click();
		
		aDriver.findElementById("com.miui.calculator:id/btn_8_s").click();
		aDriver.findElementByAccessibilityId("plus").click();
		aDriver.findElementById("com.miui.calculator:id/btn_5_s").click();
		Thread.sleep(3000);
		
		String txt = aDriver.findElementByAndroidUIAutomator(""
				+ "new UiSelector().resourceId(\"com.miui.calculator:id/txv_result\")").getText(); 
		System.out.println("Summ" + txt );	
	}
	
}
