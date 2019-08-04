package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		logger.info("Clicked Login button");
		
		//Now we will verify if we have logged in or not
		if(driver.getTitle().contentEquals("GTPL Bank Manager HomePage")){
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else {
			logger.info("Login Test Failed");
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
		}
		
	}
	
}
