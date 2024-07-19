package com.e2e.automation.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.e2e.automation.page_objects.LoginPageSaucelabs;
import com.e2e.automation.utils.ConfigFileReader;
import com.e2e.automation.utils.SeleniumUtils;
import com.e2e.automation.utils.Validations;
import com.e2e.automation.utils.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionSaucelabs {
	public LoginPageSaucelabs loginPageSaucelabs;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public Wait wait;
	public WebDriver driver;

	public LoginStepDefinitionSaucelabs() {
		loginPageSaucelabs = new LoginPageSaucelabs();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		wait = new Wait(driver);

	}

	@Given("Je visite le site Saucelabs")
	public void jeVisiteLeSiteSaucelabs() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisie le nom d'utilsateur {string}")
	public void jeSaisieLeNomDUtilsateur(String userName) {
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

	@Then("Je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String SwagLabs) {
		WebElement actualTitle = LoginPageSaucelabs.getTitlePage(); // Assurez-vous d'avoir la méthode correcte pour
																	// obtenir l'élément
		validations.assertTrue(actualTitle, SwagLabs);
		System.out.println("The title of page is:" + SwagLabs);

	}

	@And("Je clique sur le bouton add to cart")
	public void JeCliqueSurLeBoutonADDToCart() {
		seleniumUtils.click(LoginPageSaucelabs.getBtnAdd());

	}

	@And("Je clique sur le panier")
	public void JeCliqueSurLePanier() {
		seleniumUtils.click(LoginPageSaucelabs.getPanier());

	}

	@Then("Je verifie l'ajout du produit {string}")
	public void jeVerifieLAjoutDuProduit(String expectedProduct) {

		WebElement product = LoginPageSaucelabs.getProductName();
		validations.assertEquals(product, expectedProduct);
		System.out.println("The product name is:" + expectedProduct);

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

	@Then("Je verifie le prix de produit {string}")
	public void jeVerifieLePrixDeProduit(String price) {
		WebElement priceProduct = LoginPageSaucelabs.getPrice();
		validations.assertEquals(priceProduct, price);
		System.out.println("The product price is:" + price);

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

		WebElement logout = wait.waitUntilClickable(driver, LoginPageSaucelabs.getBtnLogout());
		logout.click();

	}

}
