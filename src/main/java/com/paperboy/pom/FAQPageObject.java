package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQPageObject {
	
	
	@FindBy(xpath="//span[text()='WANT TO KNOW ABOUT PAPERBOY?']") 
	public WebElement FAQ_Number_1;

	@FindBy(xpath = "//input[@ng-model=\"contactName\"]")
	public WebElement FAQ_Name;

	@FindBy(xpath = "//input[@ng-model=\"contactEmailId\"]")
	public WebElement FAQ_Email;

	@FindBy(xpath = "//input[@ng-model=\"subject\"]")
	public WebElement FAQ_Subject;

	@FindBy(xpath = "//textarea[@ng-model=\"contactMessage\"]")
    public WebElement FAQ_Message;
	
	@FindBy(xpath="//button[text()=\"Submit\"]") 
	public WebElement FAQ_Submit_Button;
	
	
	
	

}
