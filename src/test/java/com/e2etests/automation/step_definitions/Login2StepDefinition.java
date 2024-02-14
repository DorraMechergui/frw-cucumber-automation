package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.Login2Page;

import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login2StepDefinition {
	
private Login2Page login2Page ;
	
	
	public Login2StepDefinition (){
		this.login2Page = new Login2Page();
			}
		

	@Given("Je me connecte sur  l application Sauce Lab2")
	public void jeMeConnecteSurLApplicationSauceLab2() {
		login2Page.loginValide(); 
	}
	@Then("Je me redirige vers la page d authentification {string}")
	public void jeMeRedirigeVersLaPageDAuthentification(String textVal) {
		String messageValide = login2Page.textValidation.getText();
		Assert.assertEquals(textVal, messageValide);
	}

	@Given("Je me connecte sur  l application Sauce Lab2 avec coordonee non correcte")
	public void jeMeConnecteSurLApplicationSauceLab2AvecCoordoneeNonCorrecte() {
		login2Page.loginNonValide(); 
	}

	@Then("Un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String textWrong) {
		String message2 =login2Page.textNonVal2.getText() ;
		Assert.assertEquals(textWrong, message2);
	}

	
	@Given("Je me connecte sur  l application Sauce Lab2 avec plusieurs donnees")
	public void jeMeConnecteSurLApplicationSauceLab2AvecPlusieursDonnees() {
		login2Page.getURL200();
	}


	@When("Je saisie les usernames {string}")
	public void jeSaisieLesUsernames(String string) {
		login2Page.fillPasswordOutline(string);
	}
	@When("Je saisie password {string}")
	public void jeSaisiePassword(String string) {
		login2Page.fillUserOutline(string);
	}
	@When("Je clique sur login")
	public void jeCliqueSurLogin() {
		login2Page.clickOuline();
	}
	
	
	




	}





