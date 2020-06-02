package Appium;

import org.testng.annotations.Test;

public class LaunchAnotherApp extends App_DemoApp_Launch {
	
	@Test
	public void test1() throws InterruptedException
	{
		// Start another app
		Thread.sleep(3000);
		aDriver.startActivity("com.miui.calculator", ".cal.AllInOneCalculatorActivity");
		Thread.sleep(3000);
	    aDriver.launchApp();
	}
}

