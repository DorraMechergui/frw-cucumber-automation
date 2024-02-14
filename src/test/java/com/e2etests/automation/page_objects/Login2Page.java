package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class Login2Page {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement userName2;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password2;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement BtnLogin2;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement textValidation;
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
	public static WebElement textNonVal2;

	public Login2Page() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Method */
	public void loginValide() {
		Setup.driver.get(configFileReader.getProperties("home.url2"));
		userName2.clear();
		userName2.sendKeys(configFileReader.getProperties("home.login"));

		password2.clear();
		password2.sendKeys(configFileReader.getProperties("home.password"));
		
		BtnLogin2.click();
	}
	
	public void loginNonValide() {
		Setup.driver.get(configFileReader.getProperties("home.url2"));
		userName2.clear();
		userName2.sendKeys(configFileReader.getProperties("home.login.nonCorrecte"));

		password2.clear();
		password2.sendKeys(configFileReader.getProperties("home.password.nonCorrect"));
		
		BtnLogin2.click();
	}
	
	public void getURL200() {
		Setup.driver.get(configFileReader.getProperties("home.url2"));
		
	}
	public void fillUserOutline(String name) {
		userName2.sendKeys(name);
		userName2.clear();
	}
	public void fillPasswordOutline(String pass) {
		password2.clear();
		password2.sendKeys(pass);
	}
		public void clickOuline() {
			BtnLogin2.click();
		}
	
	
	
}

