package com.paperboy.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paperboy.genericlibraries.Browser;
import com.paperboy.genericlibraries.ExcelLibrary;
import com.paperboy.pom.HomePageObject;
import com.paperboy.pom.ReadersPageObject;

public class Subscribe {

	WebDriver driver;
	HomePageObject homepageobject;
	ReadersPageObject readerspageobject;
	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browser.getBrowser();
		homepageobject = PageFactory.initElements(driver, HomePageObject.class);
	}

	@Test

	public void login_2() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 1, 0);
		String Password = excelLibrary.getExceldata("Login_data", 1, 1);
		// String ActualText = excelLibrary.getExceldata("URL", 0, 0);

		homepageobject.loginToPaperboy_2(Username, Password);
		Thread.sleep(3000);
	
	}

	@Test
	public void subscribe() throws Throwable {

		homepageobject.Subcribe_Newspaper();

		String ExpectedText = excelLibrary.getExceldata("Newspaper", 0, 0);
		String ActualText = homepageobject.ReadersPage_Verify_MyNewspaper.getText();
		Assert.assertEquals(ExpectedText, ActualText);
		Reporter.log("login_1 test verified successfully", true);
		Thread.sleep(3000);
		homepageobject.Logout();

	}

	/*@AfterMethod

	public void logout() throws Throwable {

		homepageobject.Logout();
		Thread.sleep(2000);
	}*/

	
	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

	}

}
