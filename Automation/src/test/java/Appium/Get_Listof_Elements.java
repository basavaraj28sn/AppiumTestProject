package Appium;

import java.util.List;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class Get_Listof_Elements  extends App_DemoApp_Launch{
	
	@Test
	public void dropdownlist() throws InterruptedException
	{
		aDriver.findElementByAccessibilityId("Views").click();
		aDriver.findElementByAccessibilityId("Controls").click();
		aDriver.findElementByAccessibilityId("2. Dark Theme").click();
	
		aDriver.findElementById("io.appium.android.apis:id/edit").sendKeys("Test");
		aDriver.hideKeyboard();		
		aDriver.findElementById("android:id/text1").click();
		
		List dropList = aDriver.findElementsById("android:id/text1");
		
		for(int i=0; i< dropList.size(); i++)
		{
		   MobileElement listItem = (MobileElement) dropList.get(i);   
		   System.out.println(listItem.getText());
		}  
	}
}