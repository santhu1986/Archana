package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\geckodriver.exe");
	//Launch Firefox
		
		WebDriver driver=new ChromeDriver();
		
		//maximise
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//URL
		
		driver.get("http://www.google.com");
		
		/*//Admin login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		//Branches
		
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		//Dropdown
		
		Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		ctry.selectByVisibleText("INDIA");
		
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		//Role
		//Employee
		
*/
	}

}
