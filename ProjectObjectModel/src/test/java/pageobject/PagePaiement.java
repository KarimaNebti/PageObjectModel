package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {
	
	public WebDriver driver ;
	//constructeur
	
	public PagePaiement (WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
}
	
	//identification des elements
			@FindBy (how =How.XPATH, using ="//a[normalize-space()='Proceed To Checkout']")
			WebElement bt_Proceed_to_checkout;
			@FindBy (how =How.XPATH, using ="//a[normalize-space()='Place Order']")
			WebElement bt_Place_order ;
			@FindBy (how =How.XPATH, using ="//input[@name='name_on_card']")
			WebElement name_card ;
			@FindBy (how =How.XPATH, using ="//input[@name='card_number']")
			WebElement card_number ;
			@FindBy (how =How.XPATH, using ="//input[@placeholder='ex. 311']")
			WebElement CVC ;
			@FindBy (how =How.XPATH, using ="//input[@placeholder='MM']")
			WebElement Mois_expiration ;
			@FindBy (how =How.XPATH, using ="//input[@placeholder='YYYY']")
			WebElement Année_expiration ;
			@FindBy (how =How.XPATH, using ="//button[normalize-space()='Pay and Confirm Order']")
			WebElement bt_pay_confirm_order ;
			@FindBy (how =How.XPATH, using ="//b[normalize-space()='Order Placed!']")
			WebElement txt_confirmation_ordre ;
			//creation des methodes
			public void cliquer_sur_proceed_to_chechout () {
				bt_Proceed_to_checkout.click();
			}
			public void cliquer_sur_place_order () {
				bt_Place_order.click();
			}
			public void ecrire_name_card (String txt ) {
				name_card.sendKeys(txt);
				
			}
			public void ecrire_card_number (String txt ) {
				card_number.sendKeys(txt);
				
			}
			public void ecrire_CVC (String txt ) {
				CVC.sendKeys(txt);
				
			}
			public void ecrire_mois_expiration_carte (String txt ) {
				Mois_expiration.sendKeys(txt);
				
			}
			public void ecrire_année_expiration_carte (String txt ) {
				 Année_expiration.sendKeys(txt);
				
			}
			public void cliquer_sur_pay_confirm_order () {
				 bt_pay_confirm_order.click();
			}
			public String confirmation_ordre_obtenu () {
				String txt_confirmation_ordre_obtenu = txt_confirmation_ordre.getText();
			return txt_confirmation_ordre_obtenu;
			}
}
	
