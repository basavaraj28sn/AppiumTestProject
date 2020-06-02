package Appium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class TouchAction_press extends App_DemoApp_Launch {

	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver aDriver;
	public int startx;
	public int endx;
	public int starty;
	public int endy;
	
	@Test
	public void view() throws InterruptedException
	{
		aDriver.findElementByAccessibilityId("Views").click();
	
		Thread.sleep(3000);
		Dimension size = aDriver.manage().window().getSize();
		
		int width = size.width;
		int height = size.height;
		startx = (int)width/2;
		endx = startx;
		starty = (int) (height*0.8);
		endy  = (int) (height*0.2);
		
		TouchAction action = new TouchAction(aDriver);
		action.press(startx, starty).moveTo(endx, endy).release().perform();
	}
}
