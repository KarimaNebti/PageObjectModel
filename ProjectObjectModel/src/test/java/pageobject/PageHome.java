package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageHome {
	
public WebDriver driver ;
	//constructeur
	
	public PageHome (WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//identification des elements
	@FindBy (how =How.XPATH, using ="//a[normalize-space()='Signup / Login']")
	WebElement bt_signup_login;
	@FindBy (how =How.XPATH, using = "//ul[@class='nav navbar-nav']//li//a//b")
		WebElement txt_profil;
	@FindBy (how =How.XPATH, using = "//a[@href='/products']")
	WebElement bt_Produits;
	
	//creation des methodes
	
	public void demarrer_URL (String txt) {
		
		driver.get(txt);
	}
	
	public void cliquer_sur_button_Signup_login () {
		bt_signup_login.click();
	}
	public String profil_obtenu () {
		String txt_profil_obtenu = txt_profil.getText();
	return txt_profil_obtenu;
	}
	public void cliquer_sur_bouton_produits () {
		bt_Produits.click();	

}
	}
