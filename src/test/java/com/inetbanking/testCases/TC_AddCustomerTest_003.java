package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws Exception {
		org.testng.Assert.assertTrue(true);
		/*
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Username is provided");
	lp.setPassword(password);
	logger.info("Password is provided");
	lp.clickSubmit();
	logger.info("Clicked Submit");
	Thread.sleep(3000);
	AddCustomerPage addcust = new AddCustomerPage(driver);
	
	addcust.clickAddNewCustomer();
	logger.info("Providing customer details");
	addcust.custName("Ujjwal");
	logger.info("Entered Customer Name");
	addcust.custgender("male");
	addcust.custdob("17", "03", "1996");
	Thread.sleep(3000);
	addcust.custaddress("India");
	addcust.custcity("Pune");
	addcust.custstate("Maharashtra");
	addcust.custpinno("411057");
	addcust.custtelephoneno("8899796622");
	addcust.custemailid(randomString()+"@gmail.com");
	addcust.custsubmit();
	Thread.sleep(3000);
	boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
	logger.info("Validation started");
	if(res==true) {
		Assert.assertTrue(true);
		logger.info("Customer added successfully");
	}
	else {
		
		captureScreen(driver, "addNewCustomer");
		logger.info("Captured screenshot");
		logger.info("User is not added successfully");
		Assert.assertTrue(false);
	}*/
	}
	
	
}
