package com.bit.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductDetailPage 
{
	private FirefoxDriver driver;
	
	public ProductDetailPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	public SizeAndAddToBag clickSizeAndToBag()
	{
		driver.findElement(By.xpath("//div[@class='pdpSizeListContainer']/span[3]")).click();
		driver.findElement(By.xpath("//span[@class='pdpAddToBagBtn']")).click();
		return new SizeAndAddToBag(driver);
	}
}
