package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class Install_LaunchApp {

	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver aDriver;
	
	@Test
	public void InstallnLaunchApp()
	{	
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "UIAutomator2");
		desiredCapabilities.setCapability("deviceName", "Redmi_Note_7_Pro");
		desiredCapabilities.setCapability("platformVersion", "9");
		desiredCapabilities.setCapability("platformName", "android");
		desiredCapabilities.setCapability("UDID", "48c199a1");
		desiredCapabilities.setCapability("app", "C:\\Users\\Basavaraj Sangavalli\\Desktop\\Appium\\ApiDemos-debug.apk");
		try
		{
			aDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
