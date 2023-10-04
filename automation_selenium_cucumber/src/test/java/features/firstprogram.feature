
@tag
Feature: Application Login

Scenario:Admin page default login
Given User is on Netbanking Landing page
When user login to the application
Then Home page is displayed
And Cards are displayed