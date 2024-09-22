package stepdefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUpp;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobject.PageHome;
import pageobject.PageSignUP;

public class Authentificationexerciceautomation {
	
	public static WebDriver driver = SetUpp.driver;
	PageHome home = new PageHome(driver);
	PageSignUP SignUP = new PageSignUP (driver);
	@Given("Saisir lurl suivant  {string}")
	public void saisir_lurl_suivant(String string) {
	    home.demarrer_URL(string);
	}

	@When("choisir signup login")
	public void choisir_signup_login() {
	    home.cliquer_sur_button_Signup_login();
	}

	@When("saisir ladresse mail {string} et le mot de passe {string}")
	public void saisir_ladresse_mail_et_le_mot_de_passe(String string, String string2) {
		SignUP.ecrire_email(string);
		SignUP.ecrire_mdp(string2);
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		SignUP.cliquer_sur_login();
	}

	@Then("verifier le nom du profil affiché {string}")
	public void verifier_le_nom_du_profil_affiché(String string) {
	  Assert.assertEquals(string, home.profil_obtenu()); 
	}
}


