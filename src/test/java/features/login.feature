Feature: Login API

Scenario: check login api is working and returing 200 status code

	Given give login payload
	When user call login api with http post method
	Then status code is 200