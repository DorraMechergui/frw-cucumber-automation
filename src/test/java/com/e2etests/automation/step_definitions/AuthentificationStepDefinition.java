package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentificationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthentificationStepDefinition {
	private AuthentificationPage authentificationPage ;
	
			
	public AuthentificationStepDefinition (){
		this.authentificationPage = new AuthentificationPage();
			}

	@Given("Je me connecte sur  l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToUrl();

	}

	@When("Je saisie username {string}")
	public void jeSaisieUsername(String name) {
		authentificationPage.fillUserName(name);

	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnButtonSubmit();	

	}


	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
	 String message =AuthentificationPage.welcomeMessage.getText() ;  
	 Assert.assertEquals(message, text);
	}




}
