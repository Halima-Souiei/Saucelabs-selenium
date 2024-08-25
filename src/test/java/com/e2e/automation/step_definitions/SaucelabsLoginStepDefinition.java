package com.e2e.automation.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.e2e.automation.page_objects.SaucelabsLoginPage;
import com.e2e.automation.utils.ConfigFileReader;
import com.e2e.automation.utils.SeleniumUtils;
import com.e2e.automation.utils.Validations;
import com.e2e.automation.utils.Wait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaucelabsLoginStepDefinition {
	public SaucelabsLoginPage loginPageSaucelabs;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public Wait wait;
	public WebDriver driver;

	public SaucelabsLoginStepDefinition() {
		loginPageSaucelabs = new SaucelabsLoginPage();
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
		seleniumUtils.writeText(SaucelabsLoginPage.getUserName(), (configFileReader.getProperties("home.login")));

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		seleniumUtils.writeText(SaucelabsLoginPage.getPassword(), password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnLogin());
	}

	@Then("Je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String swagLabs) {
		WebElement actualTitle = SaucelabsLoginPage.getTitlePage();
																
		validations.assertTrue(actualTitle, swagLabs);
		//System.out.println("The title of page is:" + SwagLabs);

	}

	@And("Je clique sur le bouton add to cart")
	public void JeCliqueSurLeBoutonADDToCart() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnAdd());

	}

	@And("Je clique sur le panier")
	public void JeCliqueSurLePanier() {
		seleniumUtils.click(SaucelabsLoginPage.getPanier());

	}

	@Then("Je verifie l'ajout du produit {string}")
	public void jeVerifieLAjoutDuProduit(String expectedProduct) {

		WebElement product = SaucelabsLoginPage.getProductName();
		validations.assertEquals(product, expectedProduct);
		System.out.println("The product name is:" + expectedProduct);

	}

	@And("Je clique sur le bouton checkout")
	public void JeCliqueSurLeBoutonCheckout() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnCheckout());

	}

	@And("Je saisie le nom {string}")
	public void JeSaisieNom(String firstName) {
		seleniumUtils.writeText(SaucelabsLoginPage.getFirstName(), firstName);
	}

	@And("Je saisie le prenom {string}")
	public void JeSaisiePrenom(String lastName) {
		seleniumUtils.writeText(SaucelabsLoginPage.getLastName(), lastName);

	}

	@And("Je saisie le code postale {string}")
	public void JeSaisieCodePostale(String postCode) {
		seleniumUtils.writeText(SaucelabsLoginPage.getPosteCode(), postCode);

	}

	@And("Je clique sur le bouton continuer")
	public void JeCliqueSurLeBoutonContinue() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnContinue());

	}

	@Then("Je verifie le prix de produit {string}")
	public void jeVerifieLePrixDeProduit(String price) {
		WebElement priceProduct = SaucelabsLoginPage.getPrice();
		validations.assertEquals(priceProduct, price);
		System.out.println("The product price is:" + price);

	}

	@And("Je clique sur le bouton finish")
	public void JeCliqueSurLeBoutonFinish() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnFinish());

	}

	@And("Je clique sur le bouton backhome")
	public void JeCliqueSurLeBoutonBackHome() {
		seleniumUtils.click(SaucelabsLoginPage.getBtnBackHome());

	}

	@And("Je clique sur le burger menu")
	public void JeCliqueSurLeBoutonBurgerMenu() {
		seleniumUtils.click(SaucelabsLoginPage.getBurgerMenu());

	}

	@And("Je clique sur le bouton logout")
	public void JeCliqueSurLeBoutonLogout() {

		WebElement logout = wait.waitUntilClickable(driver, SaucelabsLoginPage.getBtnLogout());
		logout.click();

	}

}
