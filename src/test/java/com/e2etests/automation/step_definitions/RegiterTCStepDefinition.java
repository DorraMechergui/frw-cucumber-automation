package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;
import com.e2etests.automation.page_objects.RegisterTCPage;

import io.cucumber.java.en.When;

public class RegiterTCStepDefinition {
	private RegisterTCPage registerTCPage;

	public RegiterTCStepDefinition() {
		this.registerTCPage = new RegisterTCPage();

	}
	@When("Je saisie un data dans le champ firstname {string}")
	public void jeSaisieUnDataDansLeChampFirstname(String string) throws InterruptedException {
		registerTCPage.firstName(string);   
	}
	@When("Je saisie un data dans le champ lastname {string}")
	public void jeSaisieUnDataDansLeChampLastname(String string) {
		registerTCPage.fillLastName(string); 
	}
	@When("Je saisie un data dans le champ phone {string}")
	public void jeSaisieUnDataDansLeChampPhone(String string) {
		registerTCPage.fillPhoneCase(string);
	}
	@When("Je saisie un data dans le champ email {string}")
	public void jeSaisieUnDataDansLeChampEmail(String string) {
		registerTCPage.fillEmail(string);
	}
	@When("Je saisie un data dans le champ adress {string}")
	public void jeSaisieUnDataDansLeChampAdress(String string) {
		registerTCPage.fillAdress(string);
	}
	@When("Je saisie un data dans le champ city {string}")
	public void jeSaisieUnDataDansLeChampCity(String string) {
		registerTCPage.fillCity(string);
	}
	@When("Je saisie un data dans le champ state {string}")
	public void jeSaisieUnDataDansLeChampState(String string) {
		registerTCPage.fillState(string);
	}
	@When("Je saisie un data dans le champ postalCode {string}")
	public void jeSaisieUnDataDansLeChampPostalCode(String string) {
		registerTCPage.fillPostalCode(string);
	}
	@When("Je selectionne country {string}")
	public void jeSelectionneCountry(String string) {
		registerTCPage.fillCountry(string);
	}
	@When("Je saisie un data dans le champ username {string}")
	public void jeSaisieUnDataDansLeChampUsername(String string) {
		registerTCPage.fillUserName(string);
	}
	@When("Je saisie un data dans le champ password {string}")
	public void jeSaisieUnDataDansLeChampPassword(String string) {
		registerTCPage.fillPassword(string);
	}
	@When("Je confirme dans le champ confirmpassword {string}")
	public void jeConfirmeDansLeChampConfirmpassword(String string) {
		registerTCPage.fillConfirmpassdword(string); 
	}



}
