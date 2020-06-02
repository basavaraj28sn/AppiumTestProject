package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;

public class App_Cal_Launch {
	
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
		desiredCapabilities.setCapability("appPackage", "com.miui.calculator");
		desiredCapabilities.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		try
		{
			aDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
