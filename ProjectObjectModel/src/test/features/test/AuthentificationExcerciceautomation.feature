
@AuthentificationAutomationExercice
Feature: Authentificationn automation exercicee
  I want to use this template for my feature file

  @tag1
  Scenario: connexionn à lapplicationn
    Given Saisir lurl suivant  "https://www.automationexercise.com/"
    When choisir signup login
    And saisir ladresse mail "karimaa@gmail.com" et le mot de passe "123"
    And cliquer sur le bouton login 
    Then verifier le nom du profil affiché "Karima"
 

 