@booking.com
Feature: Verify Users Rest API Responses

  @positive @api @sanity
  Scenario: Get User
    When user executes get call to fetch user details
    Then user should be able to receive a valid response in timely manner

  @positive @api @sanity
  Scenario: Create User
    When user executes post call to create a user
    Then user should be able to receive a valid response in timely manner