package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatePageObject {

	@FindBy(id="autoComplete")
    public WebElement Search_Bar;

    @FindBy(xpath="//div[@title='The Pioneer']")
    public WebElement Pioneer_Newspaper;

}
