package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageObject {

	@FindBy(xpath = "//input[@ng-model=\"contactName\"]")
	public WebElement Conatact_Name;

	@FindBy(xpath = "//input[@ng-model=\"contactEmailId\"]")
	public WebElement Conatact_Email_ID;

	@FindBy(xpath = "//textarea[@ng-model=\"contactMessage\"]")
	public WebElement Conatact_Message;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement Conatact_Submit_Button;

}
