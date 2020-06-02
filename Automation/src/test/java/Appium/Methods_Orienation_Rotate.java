package Appium;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

public class Methods_Orienation_Rotate extends App_DemoApp_Launch{

	@Test
	public void Testorientation() throws InterruptedException
	{	
		aDriver.runAppInBackground(5);
		 
		ScreenOrientation orientation= aDriver.getOrientation();
		
		System.out.println(orientation);
		Thread.sleep(3000);
		
		aDriver.rotate(ScreenOrientation.LANDSCAPE);
		aDriver.rotate(ScreenOrientation.PORTRAIT);
	}
}
