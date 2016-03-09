package com.phleet.augusta;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ConfigClass {
	
	public IOSDriver appiumServerConnectToDevice() throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);
//      ************ iPhone 4s ***************
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.2.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone"); //
		capabilities.setCapability("udid", "74f764e4067450e45ada3fbdefa7889bf6560fe6"); 

		capabilities.setCapability("app", "com.doorstepdelivery.phleetdriver");
		capabilities.setCapability("noReset", true);
		IOSDriver wd=new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return wd;
		
	}

}
