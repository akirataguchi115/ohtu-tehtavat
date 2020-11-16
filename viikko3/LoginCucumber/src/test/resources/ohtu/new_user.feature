Feature: A new user account can be created if a proper unused username and password are given

  Scenario: creation is succesful with valid username and password
    Given command new is selected
    When username "jorma" and password "uotila" are entered
    Then system will respond with "new user registered"