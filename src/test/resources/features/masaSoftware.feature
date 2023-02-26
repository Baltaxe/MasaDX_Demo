Feature: MasaSoftware functionality and verifications

  Scenario: MasaSoftware Functionality "Header" Verification
    Given User is on MasaSoftware home page
    When User clicks Company button
    Then User sees Company in the header

  Scenario: MasaSoftware Functionality "Services" Verification
    Given User is on MasaSoftware home page
    When User clicks Services button
    And User clicks Consultancy segment
    Then User sees Consultancy segment in the page

    Scenario: MasaSoftware Functinality "Language" Verification
      Given User is on MasaSoftware home page
      When User clicks Globe icon
      And User clicks Turkce in dropdown menu
      Then User sees Hakkımızda title in the page

