
Feature: Actitime Login

  Scenario: Login with valid credentials
    Given User navigates to actitime.com
    When User enters valid credentials and click on login
    Then Actitime home page is displayed
   
