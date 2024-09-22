package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSignUP {
public WebDriver driver;
	//constructeur
public PageSignUP (WebDriver driver) {
	
	this.driver =driver;
	PageFactory.initElements(driver, this);
}
	
	//identification des elements
	@FindBy (how =How.XPATH, using ="//input[@data-qa='login-email']")
	WebElement txt_email;
	@FindBy (how =How.XPATH, using ="//input[@placeholder='Password']")
	WebElement txt_mtp;
	@FindBy (how =How.XPATH, using ="//button[normalize-space()='Login']")
	WebElement bt_login ;

	//creation des methodes
	
	public void ecrire_email (String txt ) {
		txt_email.sendKeys(txt);
		
	}
	public void ecrire_mdp (String txt) {
		txt_mtp.sendKeys(txt);
	}
	public void cliquer_sur_login () {
		bt_login.click();
	}
}

