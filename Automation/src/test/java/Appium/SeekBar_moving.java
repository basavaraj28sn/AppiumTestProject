package Appium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import net.sf.cglib.core.Local;

public class SeekBar_moving extends App_DemoApp_Launch {

	public int startx;
	public int endx;
	public int starty;
	public int endy;
	
	@Test
	public void view() throws InterruptedException
	{
		aDriver.findElementByAccessibilityId("Views").click();
		
		Dimension size = aDriver.manage().window().getSize();
		
		int width = size.width;
		int height = size.height;
		startx = (int)width/2;
		endx = startx;
		starty = (int) (height*0.8);
		endy  = (int) (height*0.2);
		
		TouchAction action = new TouchAction(aDriver);
		action.press(startx, starty).moveTo(endx, endy).release().perform();
		action.press(startx, starty).moveTo(endx, endy).release().perform();		
		Thread.sleep(6000);
	
		//*******************************************
		
		aDriver.findElementByAccessibilityId("Seek Bar").click();

		WebElement we = aDriver.findElementByClassName("android.widget.SeekBar");

		Point loc= we.getLocation();
		startx = loc.getX();
		starty = loc.getY();
		endx = (int) (we.getSize().getWidth() * 0.80);
		endy = starty;
		aDriver.swipe(startx, starty, endx, endy, 2000);
		aDriver.pressKeyCode(AndroidKeyCode.ENTER);

	}
	
}
