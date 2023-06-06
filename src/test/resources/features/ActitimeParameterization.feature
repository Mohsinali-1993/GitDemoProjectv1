
Feature: Actitime Login

 
  Scenario Outline: Login with multiple creds
    Given User navigates to Actitime app
    When <username> and <password> is entered and clicked on login
    Then actitime home with <status> is displayed

    Examples: 
      | username  | passsword | status  |
      | admin     |  manager  | success |
      
