Feature: Login Page
Scenario: Validate Login button by entering valid details

Given Initialize the driver
When User enter URL
And User enters the valid username
And User enters the valid password
And User clicks on login button
Then  User Should be able to login




