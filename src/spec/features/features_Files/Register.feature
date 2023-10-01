Feature: Je verifie la page register
  En tant que utilisateur je souhaite créer un compte  a l application Mercury
  
  @register
  Scenario: Je verifie la page register
    Given Je me connecte sur l application Mercurie
    When Je clique sur le bouton register
    And Je saisie firstname "dorra"
    And Je saisie lastname "mechergui"
    And Je saisie phone "50426917"
    And Je saisie email "dorramechergui@gmail.com"
    And Je saisie adress "bizerte"
    And Je saisie city "bizerte"
    And Je saisie state "bizerte" 
    And Je saisie postalCode "7000"
    And Je saisie country 
    And Je saisie username "dorra"
    And Je saisie password "dorra"
    And Je saisie confirmpassword "dorra"
    And Je clique sur bouton envoyer
   Then Je redirige vers la page home "Thank you for registering. You may now sign-in using the user name and password you've just entered."