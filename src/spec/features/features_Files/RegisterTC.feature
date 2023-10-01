Feature: Title of your feature
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer
  
  @moduleRegister
  Scenario Outline: Remplir le formulaire Regiter
    Given Je me connecte sur l application Mercurie
    When Je clique sur le bouton register
    And Je saisie un data dans le champ firstname "<firstname>"
    And Je saisie un data dans le champ lastname "<lastname>"
    And Je saisie un data dans le champ phone "<phone>"
    And Je saisie un data dans le champ email "<email>"
    And Je saisie un data dans le champ adress "<adress>"
    And Je saisie un data dans le champ city "<city>"
    And Je saisie un data dans le champ state "<state>"
    And Je saisie un data dans le champ postalCode "<postalCode>"
    And Je selectionne country "<country>"
    And Je saisie un data dans le champ username "<username>"
    And Je saisie un data dans le champ password "<password>"
    And Je confirme dans le champ confirmpassword "<confirmpassword>"
    And Je clique sur bouton envoyer 
    Then Je redirige vers la page home "Thank you for registering. You may now sign-in using the user name and password you've just entered." 
    Examples: 
 |firstname  | lastname | phone  | email |     adress | city    |   state | postalCode | country |     username | password | confirmpassword |
 |test14     |     m    | 0000000| name1 |     o      | tunis   |     u   | 5000000    | ALBANIA |     a        | test123  | test123         | 
 |test12     |     a    | 1111111| name1 |     z      | jjjjj   |     r   | 4000000    | ANGOLA  |     b        | test321  | test321         |  
