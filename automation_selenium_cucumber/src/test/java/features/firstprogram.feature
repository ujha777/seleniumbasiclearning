
@tag
Feature: Application Login

Scenario: Admin page default login
Given User is on Netbanking Landing page
When user login to the application with admin and password 1234
Then Home page is displayed
And Cards are displayed

Scenario: User page default login
Given User is on Netbanking Landing page
When user login to the application with user and password 0953
Then Home page is displayed
And Cards are displayed

Scenario: User page default login
Given User is on Netbanking Landing page
When user login to the application with "<Username>" and password "<Password>" combination
Then Home page is displayed
And Cards are displayed

Examples: 
	|	Username | Password |
	| debituser| hello123 |
	| crediuser| hello456 |

	
