
Feature:Login

  
  Scenario Outline: Login with several credentials
    Given User navigates to actitime.com
    When I <username> and <password> entered
    Then Homepage with status displays

    Examples: 
      | username  | password | status  |
      | admin     |  manager | success |
      | trainee   | trainee  | success  |
      | abcd      | 12345    | fail  |
