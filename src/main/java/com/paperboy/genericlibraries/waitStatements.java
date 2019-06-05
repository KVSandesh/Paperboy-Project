package com.paperboy.genericlibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitStatements {

	public void waitForElementPresent(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(Browser.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

}
