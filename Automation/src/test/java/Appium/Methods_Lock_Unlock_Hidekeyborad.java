package Appium;

import org.testng.annotations.Test;

public class Methods_Lock_Unlock_Hidekeyborad extends App_DemoApp_Launch{
	
	@Test
	public void test1() throws InterruptedException
	{
	aDriver.unlockDevice();
	System.out.println(aDriver.isLocked());
	aDriver.lockDevice();
	System.out.println(aDriver.isLocked());
    //Check the notifications 
    aDriver.openNotifications();
    //Hide keyboard
    aDriver.hideKeyboard();
	}
}
