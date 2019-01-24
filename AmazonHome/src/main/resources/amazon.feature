Feature: LogIn

Description:Amazon LogIn

Scenario: Positive 

Given User on Amazon Home page


When User click sign in
And User enter UserName 
And User enter Password
And User Click signIn Button

Then User Successfully LogIn