package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInPage 
{
	private FirefoxDriver driver;
	
	public LogInPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	public ShippingAddress clickContinue()
	{
		driver.findElement(By.xpath("//input[@id='newShippingAddressFirstNameInput']")).sendKeys("Shayan");
		driver.findElement(By.xpath("//input[@id='newShippingAddressLastNameInput']")).sendKeys("Das");
		driver.findElement(By.xpath("//input[@id='newShippingAddressAddyOneInput']")).sendKeys("2508 Tratman Ave");
		driver.findElement(By.xpath("//input[@id='newShippingAddressCityInput']")).sendKeys("NewYork");
		driver.findElement(By.xpath("//select[@id='newShippingAddressCountryInput']")).sendKeys("United States");
		driver.findElement(By.xpath("//input[@id='newShippingAddressZipInputUSA']")).sendKeys("10461");
		driver.findElement(By.xpath("//input[@id='newShippingAddressPhoneInputUSA']")).sendKeys("917-453-7283");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new ShippingAddress(driver);
	}
}
