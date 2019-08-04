package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.XPATH, using=".//input[@name='name']")
	@CacheLookup
	WebElement txtCutomerName;
	@FindBy(how = How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	@FindBy(how = How.NAME, using="dob")
	@CacheLookup
	WebElement txtdob;
	@FindBy(how = How.NAME, using="addr")
	@CacheLookup
	WebElement txtaddress;
	@FindBy(how = How.NAME, using="city")
	@CacheLookup
	WebElement txtCity;
	@FindBy(how = How.NAME, using="state")
	@CacheLookup
	WebElement txtState;
	@FindBy(how = How.NAME, using="pinno")
	@CacheLookup
	WebElement txtPIN;
	@FindBy(how = How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtTelNo;
	@FindBy(how = How.NAME, using="emailid")
	@CacheLookup
	WebElement txtEmail;
	@FindBy(how = How.NAME, using="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	public void custName(String cname) {
		txtCutomerName.sendKeys(cname);
	}
	public void custgender(String cgender) {
		rdGender.click();
	}
	public void custdob(String dd, String mm, String yy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yy);
	}
	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	public void custcity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	public void custpinno(String cpin) {
	txtPIN.sendKeys(cpin);
	}
	public void custtelephoneno(String ctel) {
	txtTelNo.sendKeys(ctel);
	}
	public void custemailid(String cmail) {
	txtEmail.sendKeys(cmail);
	}
	public void custstate(String cstate) {
	txtState.sendKeys(cstate);
	}
	public void custsubmit() {
	btnSubmit.click();
	}
}
