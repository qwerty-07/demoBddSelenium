Feature: Title of your feature

  Scenario Outline: add a new user
    Given user is already logged in
    And user is in user Management module
    When click on Add user
    Then Add user form should open
    Then enter the values <fistname>, <lastname>, <email>, <accessType>
    Then click on save

    Examples: 
      | fistname | lastname | email          | accessType |
      | Rohit    | Sharma   | VK18@demo.comm | Tester     |