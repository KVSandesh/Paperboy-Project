package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paperboy.genericlibraries.waitStatements;

public class AdvertiserPageObject extends waitStatements{
	
  @FindBy(xpath="//button[text()='Publish Ads']")
  public WebElement Publish_Ads;
  
  @FindBy(xpath="//button[text()='Login']")
  public WebElement Ads_Login_1;
 
  @FindBy(xpath="//*[@id=\"myLogin\"]/div[2]/input")
  public WebElement Email_Id;
  
  @FindBy(xpath="//*[@id=\"myLogin\"]/div[3]/input")
  public WebElement Ads_Password;
  
  @FindBy(xpath="//*[@id=\"myLogin\"]/button/span")
  public WebElement Ads_Login_2;
  
  @FindBy(xpath="//*[@id=\"loginModal\"]/div/footer/a/span")
  public WebElement Ads_Sign_Up;
  
  @FindBy(xpath="//a[text()='Forgot']")
  public WebElement Ads_Forgot_Password;
  
  @FindBy(xpath="//input[@ng-model=\"email\"]")
  public WebElement Ads_Email_for_forgot_password;
  
  @FindBy(xpath="//button[@ng-click=\"forgotPassword(email)\"]")
  public WebElement Ads_Reset_Password;
  

  
  
	public void LoginasAdvertiser(String email, String password) {
		Publish_Ads.click();
		Email_Id.sendKeys(email);
		Ads_Password.sendKeys(password);
		Ads_Login_2.click();
		
	}
		
		public void ForgotPassword (String email) 
		{
			Publish_Ads.click();
			waitForElementPresent(Ads_Login_1);
			Ads_Login_1.click();
			waitForElementPresent(Ads_Forgot_Password);
			Ads_Forgot_Password.click();
			waitForElementPresent(Ads_Email_for_forgot_password);
			Ads_Email_for_forgot_password.sendKeys(email);
			Ads_Reset_Password.click();
			
			
		}
}
