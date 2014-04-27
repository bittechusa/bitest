package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver)
	{
		this.driver = driver;
		driver.get("http://www.bluefly.com");
	}
	public MenPage clikMenPageLink()
	{
		driver.findElement(By.xpath("//li[@id='main-nav-men']/a")).click();
		return new MenPage(driver);
	}


}
