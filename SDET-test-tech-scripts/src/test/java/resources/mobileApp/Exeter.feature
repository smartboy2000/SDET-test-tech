@exeter.com
Feature: Verify Terms & Conditions

  Background:
    Given user launch mobile app
    And user pass app url in mobile browser

  @positive @mobile @sanity
  Scenario: Validate web app in mobile browser
    When user clicks Privacy Policy link
    And user clicks Accept button
    And user clicks Terms & Conditions button
    And user clicks Data Protection and Privacy Policy
    And user redirects back to Terms & Conditions tab
    And user clicks Back button
    And user clicks Accept Terms & Conditions Check box
    And user clicks University of Exeter email button
    And user clicks Azure AD Button