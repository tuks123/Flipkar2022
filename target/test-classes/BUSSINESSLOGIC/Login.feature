Feature: Login Functionality
Background: User is login Successfully
Given User open "Chrome" browser with link
Given User opne a url

Scenario: Login functionality with valid credentials
When User click on cancel button
When user move on Login button
When user click on My Profile button
When user enter User id as "7972500812"
When user enter password as "Tukaram@143"
When user click on login button
Then user logged in succesfully