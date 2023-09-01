@booking.com
Feature: Verify Users Rest API Responses

  @positive @api @sanity
  Scenario: Get call to fetch response data for users
    When user executes get call to fetch user details
    Then user should be able to receive a valid response in timely manner