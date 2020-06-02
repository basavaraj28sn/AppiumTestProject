package Appium;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class Swipe_action extends App_DemoApp_Launch{

	public int startx;
	public int endx;
	public int starty;
	public int endy;
	
	@Test
	public void swipeBottomToTop() throws InterruptedException
	{
		aDriver.findElementByAccessibilityId("Views").click();
		
		Dimension size = aDriver.manage().window().getSize();
		
		int width = size.width;
		int height = size.height;
		startx = (int)width/2;
		endx = startx;
		starty = (int) (height*0.8);
		endy  = (int) (height*0.2);
		
		for (int i=0; i<2; i++)
		{
			aDriver.swipe(startx, starty, endx, endy, 2000);
		}	
	}
	
	@Test
	public void swipeTopToBottom() throws InterruptedException
	{
		Thread.sleep(2000);
		aDriver.swipe(startx, endy, endx, starty, 2000);
	}
	
}
