package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class App_Multitouch_Launch {
	
	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver aDriver;
	
	@BeforeClass
	public void OpenApp() throws InterruptedException
	{
		try
		{
			desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("automationName", "UIAutomator2");
			desiredCapabilities.setCapability("deviceName", "Redmi_Note_7_Pro");
			desiredCapabilities.setCapability("platformVersion", "9");
			desiredCapabilities.setCapability("platformName", "android");
			desiredCapabilities.setCapability("UDID", "48c199a1");
			desiredCapabilities.setCapability("appPackage", "com.the511plus.MultiTouchTester");
			desiredCapabilities.setCapability("appActivity", ".MultiTouchTester");
			aDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
			aDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}	
	}
	
	@Test
	public void multitouch() throws InterruptedException
	{
		aDriver.findElementById("android:id/button1").click();
	
		TouchAction touchAction1 = new TouchAction(aDriver);
		touchAction1.longPress(605, 500).waitAction(5000);
		Thread.sleep(4000);

		TouchAction touchAction2 = new TouchAction(aDriver);
		touchAction2.longPress(500, 900).waitAction(5000);
		Thread.sleep(4000);

		MultiTouchAction multiTouchAction1 = new MultiTouchAction(aDriver);
		multiTouchAction1.add(touchAction1).add(touchAction2).perform();	
	}

}
