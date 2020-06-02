package Appium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class SetStarRating extends App_DemoApp_Launch{
	
	
	@Test
	public void StarRating3()
	{
		  aDriver.findElementByAccessibilityId("Views").click();
    	  aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Rating Bar\"))").click();
    	  WebElement threeStarRatingbar = aDriver.findElementById("io.appium.android.apis:id/ratingbar1");
    	  
    	  int startX = threeStarRatingbar.getLocation().getX();
    	  System.out.println(startX);
    	  int endX = threeStarRatingbar.getSize().getWidth();
    	  System.out.println(endX);	  
    	  int yAxis = threeStarRatingbar.getLocation().getY();
    	  
    	  int tapAt = (int) (endX * 1);    
    	  TouchAction act=new TouchAction(aDriver);  
    	  act.press(tapAt,yAxis).release().perform();
	}
	
	 @Test
	 public void StarRating5()
	 {  
	  WebElement fiveStarRatingbar = aDriver.findElementById("io.appium.android.apis:id/ratingbar2");
	  int startX = fiveStarRatingbar.getLocation().getX();
	  System.out.println(startX);
	  int endX = fiveStarRatingbar.getSize().getWidth();
	  System.out.println(endX);
	  int yAxis = fiveStarRatingbar.getLocation().getY();
	  
	  int tapAt = (int) (endX * 0.8);  
	  TouchAction act=new TouchAction(aDriver);  
	  act.press(tapAt,yAxis).release().perform();
	 }
}
