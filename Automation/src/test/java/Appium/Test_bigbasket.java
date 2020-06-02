package Appium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class Test_bigbasket extends App_BigBasket_Launch {

	@Test
	public void Searchmangoes() throws InterruptedException
	{
		/*Thread.sleep(3000);
		aDriver.findElementById("com.bigbasket.mobileapp:id/text_start_exploring").click();
		aDriver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").sendKeys("Mangoes");*/
		
		Thread.sleep(3000);
		aDriver.findElementById("com.bigbasket.mobileapp:id/text_login").click();
		
		Thread.sleep(3000);
		aDriver.findElementById("com.truecaller:id/confirm").click();

		Thread.sleep(3000);
		aDriver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		aDriver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		
		aDriver.pressKeyCode(AndroidKeyCode.ENTER);
		aDriver.findElementById("com.bigbasket.mobileapp:id/btnAddToBasket").click();

		Thread.sleep(3000);
		aDriver.findElementById("com.bigbasket.mobileapp:id/imgCategory").click();

		


	
	}
}

