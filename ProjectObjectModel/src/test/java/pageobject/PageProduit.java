package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduit {
	
	public WebDriver driver ;
	//constructeur
	
		public PageProduit (WebDriver driver) {
			
			this.driver =driver;
			PageFactory.initElements(driver, this);
		}
		//identification des elements
		@FindBy (how =How.XPATH, using ="//a[@data-product-id='1']")
		WebElement bt_produit1;
		@FindBy (how =How.XPATH, using ="//a[@data-product-id='2']")
		WebElement bt_produit2;
		@FindBy (how =How.XPATH, using ="//button[@data-dismiss='modal']")
		WebElement bt_continuer_achat;
		@FindBy (how =How.LINK_TEXT, using ="View Cart")
		WebElement bt_voir_panier;
		//creation des methodes
		public void ajouter_premier_produit () {
			bt_produit1.click();	
		}
		public void ajouter_deuxieme_produit () {
			bt_produit2.click();	
		}
		public void cliquer_sur_continuer_achat () {
			bt_continuer_achat.click();	
		}
		public void cliquer_sur_voir_panier () {
			bt_voir_panier.click();	
		}
		//public void scrool_to_element (WebElement element) {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", Select_old_Style);
		//}
}
