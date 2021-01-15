package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{

	DesiredCapabilities Cap=null;
	@Parameters("browser")
	@Test
	public void Sgd(String Br) throws MalformedURLException, InterruptedException
	{
		if (Br.equalsIgnoreCase("firefox")) 
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("firefox");
			Cap.setPlatform(Platform.WINDOWS);
        }
		else if (Br.equalsIgnoreCase("chrome"))
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("chrome");
			Cap.setPlatform(Platform.WINDOWS);
			
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"),Cap);
	
         driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//URL
		
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Gm")).click();
		
	
	}
}
