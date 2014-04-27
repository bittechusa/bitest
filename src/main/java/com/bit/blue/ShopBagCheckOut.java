package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopBagCheckOut 
{
	private FirefoxDriver driver;
	
	public ShopBagCheckOut(FirefoxDriver driver) 
	{
		this.driver = driver;
	}
	public LogInPage clickLogIn()
	{
		driver.findElement(By.xpath("//input[@id='emailAddressInput']")).sendKeys("bimaldas6@aol.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@class='loginUserFormSubmitBtn']")).click();
		return new LogInPage(driver);
	}
}
