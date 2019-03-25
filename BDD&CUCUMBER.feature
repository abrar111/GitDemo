Feature: validate log in

Background:
Given i nevigate to facebook url
|chrome|
|firefox|
|ie|

Scenario: login to facebook
	
	When i type userName as "abc123@yahoo.com"
	And i type password as "abc34567"
	And i click on login button
	Then i should be logged in succesfully
	
	
Scenario Outline: facebook login
	
	When type userName as "userid"
	And type password as "password"
	And click on login button
	Then should be logged in succesfully
	
	Examples:
	|userid | password|
	|abcd|15266255|
	|hgsjhg|76279|