package com.phleet.augusta;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class LiveOrder {
	static IOSDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	
	ConfigClass config = new ConfigClass();
	driver = config.appiumServerConnectToDevice();
		// TODO Auto-generated method stub
	
	
		

	}
	public void LiveOrders() throws InterruptedException {
		((WebElement) driver.findElements(By.className("UIACollectionCell")).get(1)).click();
		
		
		//((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
