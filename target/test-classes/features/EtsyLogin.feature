
Feature: Etsy

  As a user, I should be able to search on the Etsy Page

  Background:
    Given User is on https://www.etsy.com


   @Etsy
  Scenario: Etsy Title Verification
    Then User sees title is as expected
    # Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

   @Etsy
   Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types Wooden Spoon in the search box
    Then User clicks search button
    And User sees Wooden Spoon is in the title

   @Etsy
   Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When User types "Wooden Spoon" in the search box
    Then User clicks search button
    And User sees Wooden Spoon is in the title


