@smartBearOrder
Feature: SmartBear order process

  Scenario: SmartBear order process

    Given User is logged into SmartBear Tester account
    When on Order page
  # User fills out the form as followed:
    Then User selects FamilyAlbum from product dropdown
    Then User enters "4" to quantity
    Then User enters "John Wick" to costumer name
    Then User enters "Kinzie Ave" to street
    Then User enters "Chicago" to city
    Then User enters "IL" to state
    Then User enters "60056" on zip
    Then User selects Visa as card type
    Then User enters "1111222233334444" to card number
    Then User enters "12/22" to expiration Date
    Then User clicks process button
    Then User clicks view all Orders
    Then User verifies "John Wick" is in the list


