Feature: Authentification
  En tant que utilisateur je souhaite m authentifier

  @login2-casPassant
  Scenario: Verification d authentification
    Given Je me connecte sur  l application Sauce Lab2
    Then Je me redirige vers la page d authentification "Products"

  @login2-casNonPassant
  Scenario: Verification d authentification
    Given Je me connecte sur  l application Sauce Lab2 avec coordonee non correcte
    Then Un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"

  @loginOutline2
  Scenario Outline: Je souhaite se connecter avec plusieurs donnees
    Given Je me connecte sur  l application Sauce Lab2 avec plusieurs donnees
    When Je saisie les usernames "<username>"
    When Je saisie password "<password>"
    When Je clique sur login
  

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | visual_user             | secret_sauce |
