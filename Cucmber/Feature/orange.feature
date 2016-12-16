Feature: Login and Logout Functionality of orangehrm 

Scenario: Login Test
	
	Given the browser is launched and navigated to url
	When the tester enter username and password 
	And click on login button
	Then Welcome message should be displayed
	
Scenario: Logout Test

	When Tester click on welcome admin link
	And also click on logout link
	Then should logout and it should display home page	
	
	