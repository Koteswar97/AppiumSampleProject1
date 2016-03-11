package com.phleet.augusta;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class Slide_Menu {
	static IOSDriver driver;
	static Slide_Menu slide_menu;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		slide_menu = new Slide_Menu();
		
		ConfigClass config = new ConfigClass();
		driver = config.appiumServerConnectToDevice();
			// TODO Auto-generated method stub
		
		
		//loginDriver.loginPage();
		//loginDriver.BecomeDriver();
//		loginDriver.DriverStatues();
		//loginDriver.LocationSet();
		//loginDriver.LiveOrders();
		//loginDriver.secondOrder();
		//loginDriver.moreOrdersButto();
		//loginDriver.changeOrderStatues();
		//loginDriver.ViewOrderDetails();
		//loginDriver.License_Insurance_Info();
		slide_menu.slide_Menu_Home();
		
		
		
			

		}
	
	public void slide_Menu_Home() throws InterruptedException {
		
		Thread.sleep(5000);
		((WebElement) driver.findElements(By.className("UIACollectionCell")).get(0)).click();
		driver.findElement(By.name("rightBarButtonImage")).click();
		Thread.sleep(5000);
		//driver.scrollTo("Home").click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
		((WebElement) driver.findElements(By.className("UIACollectionCell")).get(0)).click();
		slide_menu.slide_Menu_Profile();
	//	slide_menu.slide_Menu_Current_Order();
		//driver.quit();
		
		
	}
public void slide_Menu_Current_Order() throws InterruptedException {
		
		Thread.sleep(5000);
		//((WebElement) driver.findElements(By.className("UIACollectionCell")).get(0)).click();
		driver.findElement(By.name("rightBarButtonImage")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")).click();
		Thread.sleep(15000);
		slide_menu.slide_Menu_Profile();
		
	}
public void slide_Menu_Profile() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.name("rightBarButtonImage")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")).click();
	Thread.sleep(15000);
	slide_menu.slide_Menu_Chnage_Password();
	//driver.quit();
}
public void slide_Menu_Chnage_Password() throws InterruptedException {
	
	driver.findElement(By.name("rightBarButtonImage")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]")).click();
	Thread.sleep(15000);
	slide_menu.slide_Menu_Legal();
}

public void slide_Menu_Legal() throws InterruptedException {
	driver.findElement(By.name("rightBarButtonImage")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]")).click();
	Thread.sleep(15000);
	slide_menu.slide_Menu_Signout();
	//driver.quit();
}
public void slide_Menu_Signout() throws InterruptedException {
	driver.findElement(By.name("rightBarButtonImage")).click();
	Thread.sleep(5000);
	driver.scrollTo("Sign Out").click();
	 driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
	Thread.sleep(15000);
	driver.quit();
}
	


}
