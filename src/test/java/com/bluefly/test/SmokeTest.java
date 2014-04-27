package com.bluefly.test;

import org.junit.Test;

import com.bit.blue.HomePage;
import com.bit.blue.LogInPage;
import com.bit.blue.MenPage;
import com.bit.blue.ProductDetailPage;
import com.bit.blue.ShippingAddress;
import com.bit.blue.ShopBagCheckOut;
import com.bit.blue.SizeAndAddToBag;

public class SmokeTest extends BaseTest
{
	MenPage menPage;
	ProductDetailPage product;
	SizeAndAddToBag sizeBag;
	ShopBagCheckOut checkOut;
	LogInPage logInPage;
	ShippingAddress customerIfo;
	@Test
	public void menProductPurchase() throws Exception
	{
		HomePage homePage = new HomePage(driver);
		menPage = homePage.clikMenPageLink();
		product = menPage.clickFirstProductImage();
		sizeBag = product.clickSizeAndToBag();
		checkOut = sizeBag.clickCheckOut();
		logInPage = checkOut.clickLogIn();
		customerIfo = logInPage.clickContinue();
		
		Thread.sleep(5000);
		
	}
}
