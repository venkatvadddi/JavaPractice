Feature: Verifying GET Method

Background: user generates authorization token
	Given user have authorized token

@regression
Scenario: Authorized user can retrieve data using GET method
	Given I am authorized user
	When user performs GET operation
	Then user should get all user information

	
	
	
	