package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{

	WebDriver driver;
	
	@BeforeMethod
	public void Launch() throws InterruptedException 
	{
	//Firefox
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void Goggle() throws InterruptedException 
	{
		driver.get("http://www.google.com");
		Thread.sleep(3000);
	}
	@Test
	public void Facebook() throws InterruptedException 
	{
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void Aclose() 
	{
		driver.close();
		
	}
}
