package com.paperboy.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialPageObject {
	
	@FindBy(xpath="//a[@href='http://tinyurl.com/j5ftw6h' and @title='Play Store']")
	public WebElement Android_Page;
	
	@FindBy(xpath="//a[@href='http://tinyurl.com/h7j4y38' and @title='iOS']")
	public WebElement IOS_Page;
	
	@FindBy(xpath="//a[@title='Facebook']")
	public WebElement Facebook_Page;
	
	@FindBy(xpath="//a[@title='Twitter']")
	public WebElement Twitter_Page;
	
	@FindBy(xpath="//a[@title='Linkedin']")
	public WebElement LinkedIn_Page;
		

}

