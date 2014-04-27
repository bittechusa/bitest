package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenPage 
{
	private FirefoxDriver driver;
	
	public MenPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	public ProductDetailPage clickFirstProductImage()
	{
		driver.findElement(By.xpath("//div[@id='departmentCrossSellContainer']/div[2]/div[1]/a/img")).click();
		return new ProductDetailPage(driver);
		
	}
}
