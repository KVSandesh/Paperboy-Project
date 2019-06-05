package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paperboy.genericlibraries.waitStatements;

public class HomePageObject extends waitStatements {

	@FindBy(id = "autoComplete")
	public WebElement SearchBar;

	@FindBy(id = "telugu")
	public WebElement Telgupapers;

	@FindBy(id = "kannada")
	public WebElement KannadaPapers;

	@FindBy(id = "hindi")
	public WebElement HindiPapers;

	@FindBy(id = "english")
	public WebElement EnglishPapers;

	@FindBy(id = "bengali")
	public WebElement Bengalipapers;

	@FindBy(id = "nepali")
	public WebElement NeplaiPapers;

	@FindBy(id = "punjabi")
	public WebElement PunjabiPapers;

	@FindBy(id = "urdu")
	public WebElement UrduPapers;

	@FindBy(id = "assamese")
	public WebElement AssamesePapers;

	@FindBy(id = "marathi")
	public WebElement MarathiPapers;

	@FindBy(id = "gujurati")
	public WebElement GujuratiPapers;

	@FindBy(id = "tamil")
	public WebElement TamilPapers;

	@FindBy(id = "odia")
	public WebElement OdiaPapers;

	@FindBy(xpath = "//a[text()='Log In/ Sign Up']")
	public WebElement LoginButton_Home;

	@FindBy(id = "inputidentifier")
	public WebElement UserName;

	@FindBy(id = "inputpassword")
	public WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	public WebElement LoginButton;

	@FindBy(xpath = "//div/div/footer/a[text()='Create Account']")
	public WebElement CreateAccount;

	@FindBy(xpath = " //form/div/div/input[@placeholder='Email or Phone number']")
	public WebElement Enter_Email_or_PhoneNo;

	@FindBy(xpath = " //form/div/div/input[@placeholder='Choose a Password']")
	public WebElement Enter_Password;

	@FindBy(xpath = "//button[text()='Register']")
	public WebElement Register;

	@FindBy(xpath = "//a[@href='/newspapers']")
	public WebElement NewspaerLink;

	@FindBy(xpath = "//a[text()='LOG OUT']")
	public WebElement LogOut;

	// @FindBy(xpath ="//a[@href=\"/myaccount\"]")

	@FindBy(xpath = "//a[@href='/myaccount']")
	public WebElement Login_Name;

	@FindBy(xpath = "//*[@id='loginModal']/div/header/div/img")
	public WebElement Close_Login;

	@FindBy(xpath = "//*[@id='loginModal']/div/header/p[1]")
	public WebElement Login_Verify_Text;

	@FindBy(xpath = "//a[@href='sakshi-newspaper-subscribe']")
	public WebElement ReadersPage_Subscribe_Sakshi;

	/*
	 * @FindBy(xpath =
	 * "//a[@ng-click="papercart('paper')"]/parent::div[@ng-show="action=='subscribe
	 * '"]") public WebElement ReadersPage2_Subscribe_Sakshi;
	 */

	@FindBy(xpath = "//*[@id='body']/div[3]/section[1]/div[2]/section/div[1]/div[6]/div")
	public WebElement ReadersPage_Subscribe_Subscribe_Button;

	@FindBy(xpath = "//button[text()='Add']")
	public WebElement ReadersPage_Add_NewspaperSubscription;

	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement ReadersPage_Proceed_NewspaperSubscription;

	// p[text()='Sakshi']/following-sibling::p[text()='Jun 5, 2020']

	@FindBy(xpath = "//a[text()='READ']")
	public WebElement ReadersPage_Verify_MyNewspaper;

	@FindBy(xpath = "//a[text()='LOG OUT']")
	public WebElement Logout_Button;

	// Navigations and Methods

	public void navigateToNewspaper() {
		waitForElementPresent(NewspaerLink);
		NewspaerLink.click();
	}

	public void loginToPaperboy(String email, String password) throws Throwable {
		waitForElementPresent(LoginButton_Home);
		LoginButton_Home.click();
		waitForElementPresent(UserName);
		UserName.sendKeys(email);
		Password.sendKeys(password);
		waitForElementPresent(LoginButton);
		LoginButton.click();
		Thread.sleep(1000);
	}

	public void loginToPaperboy_2(String email, String password) throws Throwable

	{
		waitForElementPresent(LoginButton_Home);
		LoginButton_Home.click();
		waitForElementPresent(UserName);
		UserName.clear();
		Thread.sleep(1000);
		UserName.sendKeys(email);
		Password.clear();
		Thread.sleep(1000);
		Password.sendKeys(password);
		waitForElementPresent(LoginButton);
		LoginButton.click();

	}

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
		// ReadersPage_Verify_MyNewspaper.click();

	}

	public void Logout() throws Throwable

	{

		Logout_Button.click();
		Thread.sleep(2000);
	}
}
