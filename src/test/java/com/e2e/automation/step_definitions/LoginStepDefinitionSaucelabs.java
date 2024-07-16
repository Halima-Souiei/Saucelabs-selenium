package com.e2e.automation.step_definitions;

import com.e2e.automation.page_objects.LoginPageSaucelabs;
import com.e2e.automation.utils.ConfigFileReader;
import com.e2e.automation.utils.SeleniumUtils;
import com.e2e.automation.utils.Validations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionSaucelabs {
	public LoginPageSaucelabs loginPageSaucelabs;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;

	public LoginStepDefinitionSaucelabs() {
		loginPageSaucelabs = new LoginPageSaucelabs();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	}

	@Given("Je visite le site Saucelabs")
	public void jeVisiteLeSiteSaucelabs() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisie le nom d'utilsateur {string}")
	public void jeSaisieLeNomDUtilsateur(String string) {
		seleniumUtils.writeText(LoginPageSaucelabs.getUserName(), (configFileReader.getProperties("home.login")));

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		seleniumUtils.writeText(LoginPageSaucelabs.getPassword(), password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnLogin());
	}

	@Then("Je me rederige vers la page home")
	public void jeMeRederigeVersLaPageHome() {

		boolean isDisplayed = validations.isElementDisplayed(LoginPageSaucelabs.getElementVerif());

	}

	@And("Je clique sur le bouton add to cart")
	public void JeCliqueSurLeBoutonADDToCart() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnAdd());

	}

	@And("Je clique sur le panier")
	public void JeCliqueSurLePanier() {
		seleniumUtils.click(LoginPageSaucelabs.getPanier());

	}
	
	@And("Je clique sur le bouton checkout")
	public void JeCliqueSurLeBoutonCheckout() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnCheckout());

	}

	@And("Je saisie le nom {string}")
	public void JeSaisieNom(String firstName) {
		seleniumUtils.writeText(LoginPageSaucelabs.getFirstName(), firstName);
	}

	@And("Je saisie le prenom {string}")
	public void JeSaisiePrenom(String lastName) {
		seleniumUtils.writeText(LoginPageSaucelabs.getLastName(), lastName);

	}

	@And("Je saisie le code postale {string}")
	public void JeSaisieCodePostale(String postCode) {
		seleniumUtils.writeText(LoginPageSaucelabs.getPosteCode(), postCode);

	}
	
	@And("Je clique sur le bouton continuer")
	public void JeCliqueSurLeBoutonContinue() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnContinue());

	}
	
	@And("Je clique sur le bouton finish")
	public void JeCliqueSurLeBoutonFinish() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnFinish());

	}
	
	@And("Je clique sur le bouton backhome")
	public void JeCliqueSurLeBoutonBackHome() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnBackHome());

	}
	
	@And("Je clique sur le burger menu")
	public void JeCliqueSurLeBoutonBurgerMenu() {
		seleniumUtils.click(LoginPageSaucelabs.getBurgerMenu());

	}
	
	@And("Je clique sur le bouton logout")
	public void JeCliqueSurLeBoutonLogout() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnLogout());

	}
	
	
	
	

}
