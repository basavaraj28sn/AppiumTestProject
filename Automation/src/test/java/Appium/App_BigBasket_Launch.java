package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class App_BigBasket_Launch {
	
	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver aDriver;
	
	@BeforeClass
	public void OpenApp() throws InterruptedException
	{
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "UIAutomator2");
		desiredCapabilities.setCapability("deviceName", "Redmi_Note_7_Pro");
		desiredCapabilities.setCapability("platformVersion", "9");
		desiredCapabilities.setCapability("platformName", "android");
		desiredCapabilities.setCapability("UDID", "48c199a1");
		desiredCapabilities.setCapability("appPackage", "com.bigbasket.mobileapp");
		desiredCapabilities.setCapability("appActivity", ".activity.SplashActivity");
		//aDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
			aDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
	}

}
