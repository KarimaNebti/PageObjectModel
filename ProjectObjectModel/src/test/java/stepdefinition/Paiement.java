package stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import hooks.SetUpp;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobject.PagePaiement;

public class Paiement {
	public static WebDriver driver = SetUpp.driver;
	PagePaiement paiement = new PagePaiement(driver);
	@Given("cliquer sur le bouton proceed to checkout")
	public void cliquer_sur_le_bouton_proceed_to_checkout() {
	  paiement.cliquer_sur_proceed_to_chechout();
	}

	@When("cliquer sur le bouton place order")
	public void cliquer_sur_le_bouton_place_order() {
	    paiement.cliquer_sur_place_order();
	}

	@When("saisir le nom de la carte {string} et le numero de la carte {string}")
	public void saisir_le_nom_de_la_carte_et_le_numero_de_la_carte(String string, String string2) {
	    paiement.ecrire_name_card(string);
	    paiement.ecrire_card_number(string2);
	}

	@When("saisir le cvc {string} et le mois dexpiration {string} , lannée de lexpiration {string} de la carte")
	public void saisir_le_cvc_et_le_mois_dexpiration_lannée_de_lexpiration_de_la_carte(String string, String string2, String string3) {
	    paiement.ecrire_CVC(string);
	    paiement.ecrire_mois_expiration_carte(string2);
	    paiement.ecrire_année_expiration_carte(string3);
	}

	@When("cliquer sur le bouton pay and confirm order")
	public void cliquer_sur_le_bouton_pay_and_confirm_order() {
	  paiement.cliquer_sur_pay_confirm_order();
	}

	@Then("verifier le message affiché {string}")
	public void verifier_le_message_affiché(String string) {
		 Assert.assertEquals(string, paiement.confirmation_ordre_obtenu());
		 System.out.println("paiement effectué avec succés");
	}

}
