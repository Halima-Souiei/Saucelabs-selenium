package com.e2e.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.automation.utils.BasePageSaucelabs;
import com.e2e.automation.utils.Setup;

 
	
	public class LoginPageSaucelabs extends BasePageSaucelabs {

		/* Retrieve web element */
		@FindBy(how = How.ID, using = "user-name")
		private static WebElement userName;

		@FindBy(how = How.ID, using = "password")
		private static WebElement password;

		@FindBy(how = How.ID, using = "login-button")
		private static WebElement btnLogin;
		

		@FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
		private static WebElement elementVerif;
		
		@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
		private static WebElement btnAdd;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"shopping_cart_container\"]/a/span")
		private static WebElement panier;
		

		@FindBy(how = How.XPATH, using = "//*[@id=\"item_4_title_link\"]/div")
		private static WebElement productName;
		
		@FindBy(how = How.ID, using = "checkout")
		private static WebElement btnCheckout;
		
		@FindBy(how = How.ID, using = "first-name")
		private static WebElement firstName;
		
		@FindBy(how = How.ID, using = "last-name")
		private static WebElement lastName;
		
		@FindBy(how = How.ID, using = "postal-code")
		private static WebElement postCode;
		 
		@FindBy(how = How.ID, using = "continue")
		private static WebElement btnContinue;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")
		private static WebElement price;
		
		@FindBy(how = How.ID, using = "finish")
		private static WebElement btnFinish;
		
		@FindBy(how = How.ID, using = "back-to-products")
		private static WebElement btnBackHome;
		
		@FindBy(how = How.ID, using = "react-burger-menu-btn")
		private static WebElement btnBurgerMenu;
		
		@FindBy(how = How.ID, using = "logout_sidebar_link")
		private static WebElement btnLogout;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
		private static WebElement text;
		
		public LoginPageSaucelabs() {
			super(Setup.getDriver());	
		}

		/*Create method getter */
		 
		public static WebElement getUserName() {
			return userName;
		}

		public static WebElement getPassword() {
			return password;
		}

		public static WebElement getBtnLogin() {
			return btnLogin;
		}
		
		public static WebElement getElementVerif() {
			return elementVerif;
		}
		public static WebElement getBtnAdd() {
			return btnAdd;
		}
		public static WebElement getPanier() {
			return panier;
		}
		
		 public static WebElement getProductName() {
			 return productName;
		 }
		public static WebElement getBtnCheckout() {
			return btnCheckout;
		}
		
		public static WebElement getFirstName() {
			return firstName;
		}
		
		public static WebElement getLastName() {
			return lastName;
		}
		
		public static WebElement getPosteCode() {
			return postCode;
		}
		
		public static WebElement getBtnContinue() {
			return btnContinue;
		}
		
		public static WebElement getPrice() {
			return price;
		}
		
		public static WebElement getBtnFinish() {
			return btnFinish;
		}
		
		public static WebElement getBtnBackHome() {
			return btnBackHome;
		}
		
		public static WebElement getBurgerMenu() {
			return btnBurgerMenu;
		}
		
	
		public static WebElement getBtnLogout() {
			return btnLogout;
		}
		
		public static WebElement getTitlePage() {
			return text ;
		}
		
		
		


		 

	}

 
