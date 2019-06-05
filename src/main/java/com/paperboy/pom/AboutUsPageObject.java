package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPageObject {
	
	  @FindBy(xpath="//section[@class='page--about']")
	  public WebElement About_Us_Page;

	
	public void verifyText()
	{
		
		Boolean ab = About_Us_Page.getText().contains("Paperboy is an online news discovery and distribution application that aggregates newspapers");
        System.out.println(ab);
	}

}


//@FindBy(xpath="") public WebElement ;