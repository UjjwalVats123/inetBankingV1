package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;



public class TC_LoginDDT_002 extends BaseClass {

	@Test
	public void loginTestNewUser() throws IOException {

		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);
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

	/* DISABLED BELOW TESTS
	@Test(dataProvider="LoginData")
	public void loginDDT(String username, String password) throws IOException {
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	logger.info("username provided");
	lp.setPassword(password);
	logger.info("password provided");
	lp.clickSubmit();
	if(isAlertPresent()) {
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
		logger.warn("login failed");
		captureScreen(driver, "loginDDT");
		Assert.assertTrue(false);
	}
	else {
		Assert.assertTrue(true);
		logger.info("login passed");
		lp.clickLogout();
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
	}
	}
	@DataProvider(name="LoginData")
	Object[][] getData() throws IOException{
	
		String path	= System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int cocount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata [][] = new String[rownum][cocount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<cocount;j++) {
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	
	}
	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			}
	}*/
}
