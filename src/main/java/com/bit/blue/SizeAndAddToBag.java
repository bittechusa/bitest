package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SizeAndAddToBag
{
	private FirefoxDriver driver;
	
	public SizeAndAddToBag(FirefoxDriver driver) 
	{
		this.driver = driver;
	}
	public ShopBagCheckOut clickCheckOut()
	{
		driver.findElement(By.xpath("//div[@id='shopBag']/a")).click();
		driver.findElement(By.xpath("//input[@id='cartCheckOutButton']")).click();
		return new ShopBagCheckOut(driver);
	}

}
