@booking.com
Feature: Validate E2E booking workflow

  Background: login to application
    Given user is redirected to login url

  @positive @web @sanity
  Scenario: Validate end to end booking flow
    When user adds location detail as "Lucknow"
    And user adds checkin checkOut date as "2023-09-10" "2023-09-15" respectively
    And user clicks on search button
    And user proceed to check seat availability
    And user clicks on Reserve button
    And user selects room as "2"
    And user adds person information
    And user adds phone number as "9898959645" along with consent
    Then user verifies the error message as account detail is invalid
