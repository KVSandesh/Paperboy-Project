package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPageObject {

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select State\"]")
	public WebElement SubscriptionPage_Select_State;

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select MainEdition\"]")
	public WebElement SubscriptionPage_Select_Main_Edition;

	@FindBy(xpath = "//section/div/div/div[@placeholder=\"Please Select SubEdition\"]")
	public WebElement SubscriptionPage_Select_SubEdition;

	@FindBy(xpath = "//span[contains(text(),'Read')]")
	public WebElement SubscriptionPage_READ;

	@FindBy(xpath = "//ul/li/div/span[text()='one month ']")
	public WebElement SubscriptionPage_Selectmonth;

}
