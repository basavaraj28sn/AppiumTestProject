package MobileBrowserAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Launch_Browser {
	
	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver aDriver;
	
	@BeforeClass
	public void OpenApp() throws InterruptedException, MalformedURLException
	{
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("automationName", "UIAutomator2");
		desiredCapabilities.setCapability("deviceName", "Redmi_Note_7_Pro");
		desiredCapabilities.setCapability("platformVersion", "9");
		desiredCapabilities.setCapability("platformName", "android");
		desiredCapabilities.setCapability("UDID", "48c199a1");
		desiredCapabilities.setCapability("browserName", "chrome");
		aDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
	}

	@Test
	public void openfacebook() throws InterruptedException
	{
		System.out.println("Browser App");
		aDriver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		aDriver.findElementByXPath("//input[@id='m_login_email']").sendKeys("*******");
		aDriver.findElementByXPath("//input[@id='m_login_password']").sendKeys("********");
		aDriver.findElementByXPath("//button[@name='login']").click();
	}
}
