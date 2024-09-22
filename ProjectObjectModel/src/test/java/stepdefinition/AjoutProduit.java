package stepdefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUpp;
import io.cucumber.java.en.*;
import pageobject.PageHome;
import pageobject.PageProduit;

public class AjoutProduit {
	public static WebDriver driver = SetUpp.driver;
	PageHome home = new PageHome(driver);
	PageProduit Produit = new PageProduit(driver);
	@Given("cliquer sur le bouton produits")
	public void cliquer_sur_le_bouton_produits() {
	   home.cliquer_sur_bouton_produits();
	}

	@When("ajouter le premier produit")
	public void ajouter_le_premier_produit() {
	   Produit.ajouter_premier_produit();
	}

	@When("cliquer sur le bouton continuer les achats")
	public void cliquer_sur_le_bouton_continuer_les_achats() {
	    Produit.cliquer_sur_continuer_achat();
	}

	@When("ajouter le deuxieme produit")
	public void ajouter_le_deuxieme_produit() {
	    Produit.ajouter_deuxieme_produit();
	}

	@When("cliquer sur le bouton Afficher le panier")
	public void cliquer_sur_le_bouton_afficher_le_panier() {
	   Produit.cliquer_sur_voir_panier();
	}

}
