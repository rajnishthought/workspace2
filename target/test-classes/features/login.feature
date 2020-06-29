Feature: Login API
Scenario: check login api is working and returing 200 status code
	Given give login payload
	When user call "LoginAPI" with HTTP "post" method
	Then status code is 200
	

#Feature: Get my profile
#Scenario: check get my profile is working and returning 200 status code
#	Given give get my profile payload
#	When user call get my profile API with HTTP GET method
#	Then status code is 200
	