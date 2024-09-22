
@AjoutProduit
Feature: Ajout Produit
  I want to use this template for my feature file
  
 Background:
  Given Saisir lurl suivant  "https://www.automationexercise.com/"
    When choisir signup login
    And saisir ladresse mail "karimaa@gmail.com" et le mot de passe "123"
    And cliquer sur le bouton login 
    Then verifier le nom du profil affiché "Karima"
  @tag1
  Scenario: Ajouter deux produits au panier
   
    Given cliquer sur le bouton produits 
    When ajouter le premier produit 
    And cliquer sur le bouton continuer les achats
    And ajouter le deuxieme produit
    And cliquer sur le bouton Afficher le panier

 