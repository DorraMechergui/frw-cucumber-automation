package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;
	
	/*@FindBy*/
	@FindBy(how = How.XPATH ,using = "//a[normalize-space()='REGISTER']")
	public static WebElement boutonRegister;
	@FindBy(how = How.NAME ,using = "firstName")
	public static WebElement firstname;
	@FindBy(how = How.NAME ,using = "lastName")
	public static WebElement lastname;
	@FindBy(how = How.NAME ,using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID ,using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME ,using = "address1")
	public static WebElement adress;
	@FindBy(how = How.NAME ,using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME ,using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME ,using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME ,using = "country")
	public static WebElement country;
	@FindBy(how = How.NAME ,using = "email")
	public static WebElement username;
	@FindBy(how = How.NAME ,using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME ,using = "confirmPassword")
	public static WebElement confirmpassdword;
	@FindBy(how = How.NAME ,using = "submit")
	public static WebElement boutonEnvoyer;
	@FindBy(how = How.XPATH ,using = "//font[contains(text(),'Thank you for registering.')]")
	public static WebElement validationMessage;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver,this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	
		
	public void goToUrl() {
	Setup.driver.get(configFileReader.getProperties("home.url"));	
	}
	public void clickOnButtonRegister( ) {
		boutonRegister.click();
	}
	public void firstName(String firstname1 ) throws InterruptedException {
		firstname.sendKeys(firstname1);
	}
	public void fillLastName(String lastname1 ) {
		lastname.sendKeys(lastname1);
	}
	
	public void fillPhoneCase(String phone1 ) {
		phone.sendKeys(phone1);
		
	}
	public void fillEmail(String email1 ) {
		email.sendKeys(email1);
	}
	public void fillAdress(String adress1 ) {
		adress.sendKeys(adress1);
	}
	public void fillCity(String city1 ) {
		city.sendKeys(city1);
	}
	public void fillState(String state1 ) {
		state.sendKeys(state1);
	}
	public void fillPostalCode(String postalCode1 ) {
		postalCode.sendKeys(postalCode1);
	}
	public void fillCountry(String country1 ) {
     Select DropDownList = new Select(country);
     DropDownList.selectByVisibleText("EGYPT");
	}	
	public void fillUserName(String username1 ) {
		username.sendKeys(username1);
	}
	public void fillPassword(String password1 ) {
		password.sendKeys(password1);
	}
	public void fillConfirmpassdword(String confirmpassdword1 ) {
		confirmpassdword.sendKeys(confirmpassdword1);
	}
	public void clickBoutonEnvoyer(String boutonEnvoyer1 ) {
		boutonEnvoyer.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
