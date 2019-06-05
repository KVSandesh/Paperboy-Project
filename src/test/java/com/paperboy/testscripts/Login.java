package com.paperboy.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paperboy.genericlibraries.Browser;
import com.paperboy.genericlibraries.ExcelLibrary;
import com.paperboy.pom.HomePageObject;

public class Login {

	WebDriver driver;
	HomePageObject homepageobject;
	ExcelLibrary excelLibrary = new ExcelLibrary();

	@BeforeClass

	public void openBrowser() {
		driver = Browser.getBrowser();
		homepageobject = PageFactory.initElements(driver, HomePageObject.class);
	}

	@Test(enabled = false)

	public void login_1() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 1, 0);
		String Password = excelLibrary.getExceldata("Login_data", 1, 1);
		String loginnameValue = excelLibrary.getExceldata("Login_data", 1, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Name.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test

	public void a_Negativecase_1() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 2, 0);
		String Password = excelLibrary.getExceldata("Login_data", 2, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 2, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test

	public void b_Negativecase_2() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 3, 0);
		String Password = excelLibrary.getExceldata("Login_data", 3, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 3, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test

	public void Negativecase_3() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 4, 0);
		String Password = excelLibrary.getExceldata("Login_data", 4, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 4, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test

	public void Negativecase_4() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 5, 0);
		String Password = excelLibrary.getExceldata("Login_data", 5, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 5, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_5() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 6, 0);
		String Password = excelLibrary.getExceldata("Login_data", 6, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 6, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_6() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 7, 0);
		String Password = excelLibrary.getExceldata("Login_data", 7, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 7, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_7() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 8, 0);
		String Password = excelLibrary.getExceldata("Login_data", 8, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 8, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_8() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 9, 0);
		String Password = excelLibrary.getExceldata("Login_data", 9, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 9, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_9() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 10, 0);
		String Password = excelLibrary.getExceldata("Login_data", 10, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 10, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_10() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 11, 0);
		String Password = excelLibrary.getExceldata("Login_data", 11, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 11, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_11() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 12, 0);
		String Password = excelLibrary.getExceldata("Login_data", 12, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 12, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@Test(enabled = true)

	public void Negativecase_12() throws Throwable {
		String Username = excelLibrary.getExceldata("Login_data", 13, 0);
		String Password = excelLibrary.getExceldata("Login_data", 13, 1);

		String loginnameValue = excelLibrary.getExceldata("Login_data", 13, 2);

		homepageobject.loginToPaperboy(Username, Password);
		Thread.sleep(3000);
		String ActName_login = homepageobject.Login_Verify_Text.getText();

		Assert.assertEquals(ActName_login, loginnameValue);
		Reporter.log("login_1 test verified successfully", true);

	}

	@AfterMethod
	public void close_Login() throws Throwable {
		homepageobject.close_login_window();

	}

	@AfterClass(enabled = true)
	public void close_Browser() {
		driver.close();

	}

}
