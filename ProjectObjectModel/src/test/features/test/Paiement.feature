
@Paiement
Feature: Paiement des achats
  I want to use this template for my feature file
Background:
  Given Saisir lurl suivant  "https://www.automationexercise.com/"
    When choisir signup login
    And saisir ladresse mail "karimaa@gmail.com" et le mot de passe "123"
    And cliquer sur le bouton login 
    Then verifier le nom du profil affiché "Karima"
     Given cliquer sur le bouton produits 
    When ajouter le premier produit 
    And cliquer sur le bouton continuer les achats
    And ajouter le deuxieme produit
    And cliquer sur le bouton Afficher le panier
  @tag1
  Scenario: faire le paiement des produits
    Given cliquer sur le bouton proceed to checkout
    When cliquer sur le bouton place order
    And saisir le nom de la carte "karima" et le numero de la carte "13456"
    And saisir le cvc "311" et le mois dexpiration "08" , lannée de lexpiration "2028" de la carte
    And cliquer sur le bouton pay and confirm order
    Then verifier le message affiché "ORDER PLACED!"
    

  
