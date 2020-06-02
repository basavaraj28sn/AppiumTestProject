package Appium;

import org.testng.annotations.Test;

public class Cal_add_num extends App_Cal_Launch {
	
	@Test
	public void Add() throws InterruptedException
	{
		aDriver.findElementById("com.miui.calculator:id/btn_8_s").click();
		aDriver.findElementByAccessibilityId("plus").click();
		aDriver.findElementById("com.miui.calculator:id/btn_5_s").click();
		Thread.sleep(3000);
		String res = aDriver.findElementById("com.miui.calculator:id/txv_result").getText();
		System.out.println("Summ" + res );		
	}
	
}
