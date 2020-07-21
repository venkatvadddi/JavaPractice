Feature: Verifying GET Method

Background: user passes authorization token
	Given user gets authorized token

@regression
Scenario: Authorized user can retrieve data using GET method
	Given I am authorized user
	When I performs GET operation for "/users"
	Then I should get all user information

	
	
	
	