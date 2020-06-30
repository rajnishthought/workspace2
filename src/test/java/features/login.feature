Feature: Login API
Scenario: check login api is working and returing 200 status code
	Given give login payload
	When user call "LoginAPI" with HTTP "post" method
	Then status code is 200
	Then fetch authentication token from the response
	Then get "GetProfileAPI" response
	