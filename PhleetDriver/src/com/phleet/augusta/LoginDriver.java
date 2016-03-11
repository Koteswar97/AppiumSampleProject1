package com.phleet.augusta;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class LoginDriver {

	static IOSDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	LoginDriver loginDriver = new LoginDriver();
	
	ConfigClass config = new ConfigClass();
	driver = config.appiumServerConnectToDevice();
		// TODO Auto-generated method stub
	
	
	//loginDriver.loginPage();
	//loginDriver.BecomeDriver();
//	loginDriver.DriverStatues();
	//loginDriver.LocationSet();
	//loginDriver.LiveOrders();
	//loginDriver.secondOrder();
	//loginDriver.moreOrdersButto();
	//loginDriver.changeOrderStatues();
	//loginDriver.ViewOrderDetails();
	loginDriver.License_Insurance_Info();
	loginDriver.UploadInsurence();
	
		

	}
	public void loginPage() throws InterruptedException {
		driver.findElement(By.name("Sign in")).click(); // Sign in

		//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
		driver.findElement(By.name("OK")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).sendKeys("kotes.mannam@augustasoftsol.com");
		driver.findElement(By.name("Done")).click();
		driver.findElement(By.name("Sign in")).click();
		driver.findElement(By.name("OK")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).clear();
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).sendKeys("kotes.mannam@augustasoftsol.com");
		driver.findElement(By.name("Done")).click();
		((WebElement) driver.findElements(By.className("UIASecureTextField")).get(0)).sendKeys("1234567");
		driver.findElement(By.name("Done")).click();
		driver.findElement(By.name("Sign in")).click();
		//Thread.sleep(10000);
		driver.findElement(By.name("Ok")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).clear();
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).sendKeys("one@one.com");
		driver.findElement(By.name("Done")).click();
		((WebElement) driver.findElements(By.className("UIASecureTextField")).get(0)).clear();
		((WebElement) driver.findElements(By.className("UIASecureTextField")).get(0)).sendKeys("123456");
		
		
		Thread.sleep(10000);
		driver.quit();
		
	}
	public void BecomeDriver() throws InterruptedException {
		driver.findElement(By.name("Become a Driver")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Create an Account")).click();
		driver.findElement(By.name("Ok")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).sendKeys("kotes");
		driver.findElement(By.name("Done")).click();
		driver.findElement(By.name("Create an Account")).click();
	
		driver.findElement(By.name("Ok")).click();
		
		
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(1)).sendKeys("mannam");
		driver.findElement(By.name("Next")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(2)).sendKeys("kotes@gmail.com");
		driver.findElement(By.name("Next")).click();
		
		((WebElement) driver.findElements(By.className("UIATextField")).get(3)).sendKeys("9952172748");
		driver.findElement(By.name("Next")).click();
		// //UIAApplication[1]/UIAWindow[4]/UIAPicker[1]/UIAPickerWheel[1]
//		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAPicker[1]/UIAPickerWheel[3]")).sendKeys("2000");
//		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAPicker[1]/UIAPickerWheel[2]")).sendKeys("August");
//		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAPicker[1]/UIAPickerWheel[1]")).sendKeys("20");
	
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0)).sendKeys("5");
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(1)).sendKeys("August");
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(2)).sendKeys("1990");
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIATextField")).get(5)).sendKeys("Koteswar_141");
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIATextField")).get(6)).sendKeys("7-141,dallas");
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIATextField")).get(7)).sendKeys("dallas");
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0)).sendKeys("Texas");
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIATextField")).get(9)).sendKeys("75255");
		driver.findElement(By.name("Done")).click();
		//driver.findElement(By.name("Next")).click();
		driver.findElement(By.name("Create an Account")).click();
		driver.findElement(By.name("Ok")).click();
		
		
		
		
	}
	
	public void DriverStatues() throws InterruptedException {
		((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		Thread.sleep(3000);
		
		((WebElement) driver.findElements(By.className("UIAButton")).get(1)).click();
		Thread.sleep(3000);
		
		((WebElement) driver.findElements(By.className("UIAButton")).get(2)).click();
		Thread.sleep(3000);
		((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	public void LocationSet() throws InterruptedException {
		Thread.sleep(10000);
		//((WebElement) driver.findElements(By.className("UIATextField")).get(0)).clear();
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).clear();
		((WebElement) driver.findElements(By.className("UIATextField")).get(0)).sendKeys("90020");
		driver.findElement(By.name("Done")).click();
	
	}
	
	public void LiveOrders() throws InterruptedException {
		((WebElement) driver.findElements(By.className("UIACollectionCell")).get(1)).click();
		
		
		//((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		
		Thread.sleep(3000);
	//	driver.quit();
		
	}
	
	public void secondOrder () throws InterruptedException {
		driver.findElement(By.name("Accept Order")).click();
		Thread.sleep(15000);
		driver.findElement(By.name("Ok")).click();
		Thread.sleep(10000);
		
			//driver.quit();
	}
	
	public void moreOrdersButto () throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.name("More")).click();
		Thread.sleep(10000);
			//driver.quit();
	}
	 //UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIASegmentedControl[1]/UIAButton[2]

	public void changeOrderStatues() throws InterruptedException{
		
		
		
		List elements1 = driver.findElements(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell"));
		int numCells1 = elements1.size();
		System.out.println("elements Count"+numCells1);
		if (numCells1 > 0) {
			//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIASegmentedControl[1]/UIAButton[2]")).click();	
			//driver.findElements(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).c;
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASegmentedControl[1]/UIAButton[3]")).click();
			//Thread.sleep(15000);
		}
		
		//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIASegmentedControl[1]/UIAButton[2]")).click();
		Thread.sleep(15000);
		//driver.quit();
	}
	
	public void ViewOrderDetails() throws InterruptedException {
		
		
		
		//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIASegmentedControl[1]/UIAButton[2]")).click();
		
	((WebElement) driver.findElements(By.className("UIACollectionCell")).get(2)).click();
		
		
		//((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		
		Thread.sleep(9000);
		driver.findElement(By.name("View order")).click();
		Thread.sleep(15000);
		((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		Thread.sleep(5000);
		driver.quit();
	}
	// License and  Insurance Info 
	
public void License_Insurance_Info() throws InterruptedException {
		
		
		
		//driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIASegmentedControl[1]/UIAButton[2]")).click();
		
	((WebElement) driver.findElements(By.className("UIACollectionCell")).get(0)).click();
		
		
		//((WebElement) driver.findElements(By.className("UIAButton")).get(0)).click();
		
		Thread.sleep(9000);
		driver.findElement(By.name("nexticon")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Edit")).click();
		Thread.sleep(15000);
		driver.findElement(By.name("Cancel")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Edit")).click();
		((WebElement) driver.findElements(By.className("UIATextField")).get(9)).clear();
		((WebElement) driver.findElements(By.className("UIATextField")).get(9)).sendKeys("Koteswar");
		driver.findElement(By.name("Next")).click();
		
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0)).sendKeys("Alaska");
		Thread.sleep(2000);
		driver.findElement(By.name("Next")).click();
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(0)).sendKeys("25");
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(1)).sendKeys("October");
		((WebElement) driver.findElements(By.className("UIAPickerWheel")).get(2)).sendKeys("2040");
		
		driver.findElement(By.name("Done")).click();
		Thread.sleep(10000);
		
		
		
	}

public void UploadInsurence() throws InterruptedException {
	((WebElement) driver.findElements(By.className("UIATextField")).get(12)).click();
	((WebElement) driver.findElements(By.className("UIACollectionCell")).get(1)).click();
	((WebElement) driver.findElements(By.className("UIATableCell")).get(2)).click();
	((WebElement) driver.findElements(By.className("UIACollectionCell")).get(1)).click();
	
	((WebElement) driver.findElements(By.className("UIATextField")).get(14)).sendKeys("Augusta");
	driver.findElement(By.name("Done")).click();
	driver.quit();
	
//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")).click();
	//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[2]")).click();
	
}

}
