package com.paperboy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPageObject {

	@FindBy(id = "[id='wp-custom-header-video-button']")
	public WebElement Video_Button;

	
	  //@FindBy(xpath="") public WebElement ;


	@FindBy(xpath = "//input[@class=\"search-field\"]")
	public WebElement Search_Field;

	@FindBy(xpath = "//a[@href=\"https://www.paperboy.com/blog/category/news/\"]")
	public WebElement Category_Newspaper;

	@FindBy(xpath = "//a[@href=\"https://www.paperboy.com/blog/category/newspapers-magazines/\"]")
	public WebElement Category_Newspaper_and_Magazines;

	@FindBy(xpath = "//a[@href=\"https://www.paperboy.com/blog/category/sports-news/\"]")
	public WebElement Category_Sports_News;

}
