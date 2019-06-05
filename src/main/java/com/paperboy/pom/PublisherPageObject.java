package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublisherPageObject {

	@FindBy(xpath = "//button[text()='Uploader Login']")
	public WebElement ALready_Uploader_Login;

	@FindBy(xpath = "//button[@href=\"#loginModal\"]")
	public WebElement New_Publisher_Login;

	@FindBy(xpath = "//div/button[text()='Register']")
	public WebElement New_Publisher_Register;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.companyName\"]")
	public WebElement Register_Company_Name;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.designation\"]")
	public WebElement Register_Designation;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.landline\"]")
	public WebElement Register_landline_Number;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.phone\"]")
	public WebElement Register_Phone;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.email\"]")
	public WebElement Register_Email_Id;

	@FindBy(xpath = "//input[@ng-model=\"formPublisherRegister.password\"]")
	public WebElement Register_password;

	@FindBy(xpath = "//button[@value=\"Create Account\" and text()='Register']")
	public WebElement Register_Button;

}
