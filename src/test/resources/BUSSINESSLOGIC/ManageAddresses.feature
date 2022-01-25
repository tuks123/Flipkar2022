Feature: Manage Addresses functionality
Background: User is on Flipkart main page and mouse over on Login button
Given User open "Chrome" browser with link
Given User opne a url
Given User click on cancel button
Given user move on Login button
Given user click on My Profile button
Given user enter User id as "7972500812"
Given user enter password as "Tukaram@143"
Given user click on login button

@SmokeTest
Scenario: Manage address functionality with valid data
When user click on manage addresses
When user click on Add new addresses
When user enter "Tukaram" as name
When user enter "8928074236" as mobile number
When user enter "422301" as pincode
When user enter "MIDC" as locality
When user enter "nashik" as Address
When user select home as address type
When user click on save button
Then application shows new address added successfully
