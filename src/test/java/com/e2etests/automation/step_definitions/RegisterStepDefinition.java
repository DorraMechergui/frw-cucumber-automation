package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	private RegisterPage registerPage;

	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage() ;
	}
	@Given("Je me connecte sur l application Mercurie")
	public void jeMeConnecteSurLApplicationMercurie() {
		registerPage.goToUrl();	
				
	}
	@When("Je clique sur le bouton register")
	public void jeCliqueSurLeBoutonRegister() {
		registerPage.clickOnButtonRegister();   
	}
	@When("Je saisie firstname {string}")
	public void jeSaisieFirstname(String string) throws InterruptedException {
		registerPage.firstName(string); 
	}
	@When("Je saisie lastname {string}")
	public void jeSaisieLastname(String string) {
		registerPage.fillLastName(string); 
	}
	@When("Je saisie phone {string}")
	public void jeSaisiePhone(String string) {
		registerPage.fillPhoneCase(string);
	}
	@When("Je saisie email {string}")
	public void jeSaisieEmail(String string) {
		registerPage.fillEmail(string);
	}
	@When("Je saisie adress {string}")
	public void jeSaisieAdress(String string) {
		registerPage.fillAdress(string); 
	}
	@When("Je saisie city {string}")
	public void jeSaisieCity(String string) {
		registerPage.fillCity(string);
	}
	@When("Je saisie state {string}")
	public void jeSaisieState(String string) {
		registerPage.fillState(string);
	}
	@When("Je saisie postalCode {string}")
	public void jeSaisiePostalCode(String string) {
		registerPage.fillPostalCode(string);
	}
	@When("Je saisie country")
	public void jeSaisieCountry() {
		registerPage.fillCountry(null);
	}
	@When("Je saisie password {string}")
	public void jeSaisiePassword(String string) {
		registerPage.fillPassword(string);
	}
	@When("Je saisie confirmpassword {string}")
	public void jeSaisieConfirmpassword(String string) {
		registerPage.fillConfirmpassdword(string);
	}
	@When("Je clique sur bouton envoyer")
	public void jeCliqueSurBoutonEnvoyer() {
		registerPage.clickBoutonEnvoyer(null);
	}
	@Then("Je redirige vers la page home {string}")
	public void jeRedirigeVersLaPageHome(String text) {
		 String message =RegisterPage.validationMessage.getText() ;  
		 Assert.assertEquals(message, text);
	}



			}
	
	