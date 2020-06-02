package Appium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class Drag_Drop  extends App_Drag_Sort_Launch{
	
	@Test
	public void movetoelemets2()
	{
		aDriver.findElementById("android:id/button1").click();
		
		aDriver.findElementByAndroidUIAutomator(""
				+ "new UiSelector().text(\"Basic usage playground\")").click();; 
		
		List elements = aDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		WebElement ChickCorea = (WebElement) elements.get(2);
		WebElement WayneShorter = (WebElement) elements.get(5);		
		
		TouchAction touchAction = new TouchAction(aDriver);
		touchAction.longPress(ChickCorea).moveTo(WayneShorter).release().perform();
	}
	

}
