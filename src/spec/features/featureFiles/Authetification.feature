 
@login
Feature: Je souhaite me connecter sur saucelabs
  
  
Background: 
 Given Je visite le site Saucelabs
    When Je saisie le nom d'utilsateur "standard_user"
    And Je saisie le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    
    
  @login-valide 
  Scenario: Connexion avec de donnees valides
    Then Je me rederige vers la page home
    
  @ajout-produit 
  Scenario: Ajouter un produit au panier  
   And Je clique sur le bouton add to cart  
   And Je clique sur le panier 
   And Je clique sur le bouton checkout
   And Je saisie le nom "Halima"
   And Je saisie le prenom "Souiei"
   And Je saisie le code postale "2300"
   And Je clique sur le bouton continuer 
   And Je clique sur le bouton finish
   And Je clique sur le bouton backhome
   And Je clique sur le burger menu
   And Je clique sur le bouton logout
    

   