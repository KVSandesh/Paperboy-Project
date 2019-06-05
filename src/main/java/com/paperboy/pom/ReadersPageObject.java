package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paperboy.genericlibraries.waitStatements;

public class ReadersPageObject extends waitStatements {

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select State\"]")
	public WebElement ReadersPage_Select_State;

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select MainEdition\"]")
	public WebElement ReadersPage_Select_Main_Edition;

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select SubEdition\"]")
	public WebElement ReadersPage_Select_SubEdition;

	@FindBy(xpath = "//span[contains(text(),'Read')]")
	public WebElement ReadersPage_READ;

	@FindBy(xpath = "//a[@href='sakshi-newspaper-subscribe']")
	public WebElement ReadersPage_Subscribe_Sakshi;

	// @FindBy(xpath =
	// "//a[@ng-click="papercart('paper')"]/parent::div[@ng-show="action=='subscribe'"]")

	@FindBy(xpath = "//*[@id='body']/div[3]/section[1]/div[2]/section/div[1]/div[6]/div")
	public WebElement ReadersPage_Subscribe_Subscribe_Button;

	@FindBy(xpath = "//button[text()='Add']")
	public WebElement ReadersPage_Add_NewspaperSubscription;

	@FindBy(id = "telugu")
	public WebElement Telgupapers;

	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement ReadersPage_Proceed_NewspaperSubscription;

	// p[text()='Sakshi']/following-sibling::p[text()='Jun 5, 2020']

	@FindBy(xpath = "//a[text()='READ']")
	public WebElement ReadersPage_Verify_MyNewspaper;

	@FindBy(xpath = "//*[@id='loginModal']/div/header/div/img")
	public WebElement Close_Login;
	
	
	
	public void close_login_window() throws Throwable

	{

		Close_Login.click();
		Thread.sleep(1000);

	}

	public void Subcribe_Newspaper() throws Throwable

	{
		Thread.sleep(1000);
		Telgupapers.click();
		// waitForElementPresent(ReadersPage_Subscribe_Sakshi);
		Thread.sleep(3000);
		ReadersPage_Subscribe_Sakshi.click();
		// waitForElementPresent(ReadersPage_Subscribe_Subscribe_Button);
		Thread.sleep(3000);
		ReadersPage_Subscribe_Subscribe_Button.click();
		Thread.sleep(3000);
		ReadersPage_Add_NewspaperSubscription.click();
		Thread.sleep(3000);
		ReadersPage_Proceed_NewspaperSubscription.click();

		Thread.sleep(5000);
		
	}
}
		
