
Feature: Skillrary sample

  Background:
    Given User navigates to skillrary
    When User clicks on gears Tab
    And User clicks on skillrary demo app
    Then Navigation to skillrary demo app in new tab

Scenario: Add to cart
    Given User mousehover to course
    And Clicks on selenium training
    When User double clicks on plus and clicks on add to cart
    And Clicks on OK in alert
    Then Item should be added to cart
    
    Scenario: My cart Area
    Given User selects testing from category dropdown
    When User drags and drops python image to my cart
    Then Python should be added to cart
    
    Scenario: Contact us
    Given User clicks on contact us link
    When User enters contact details
    And User clicks on send us mail
    Then Contact details should be sent
 
    
