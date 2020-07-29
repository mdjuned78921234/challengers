package com.oscommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="input[name='keywords']")
	WebElement quickFind;
	
	public void enterQuickFind() {
		quickFind.sendKeys("samsung");

	}
	@FindBy(css="input[title=' Quick Find ']")
	WebElement searchButton;
	
	public void clickQuickSearch() {
	searchButton.click();
	
	}

	
		
	}
	
	
	
	
	
	


