@wikimine
Feature: Wikipedia Search Functionality Header Verification


  Background:
    Given User is onWikipedia home page
    Then User types Steve Jobs in the wiki search box
    Then User clicks wiki search button

 Scenario: User verifies wikipedia search functionality title

   And User sees Steve Jobs is in the wiki title


 Scenario: User verifies wikipedia search functionality header

   And User sees Steve Jobs is in the main header


  Scenario:  User verifies wikipedia search functionality image header

   Then User sees Steve Jobs is in the image header
