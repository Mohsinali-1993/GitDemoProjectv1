
Feature: Actitime Login

  
  Scenario: Login with valid credentials
  Given User navigates to actitime
  When User provides valid credentials and click on login
  Then Actitime homepage is displayed
  
  