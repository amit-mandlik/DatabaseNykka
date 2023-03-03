Feature: To verify Nykka website dataTable without header
Description: to check login functionality
Scenario: Verify Nykka websites login functionality
Given I open my chrome browser
When I enter URL of website"https://www.nykaa.com/"
And I enter my valid username and password
  | amitdmandlik46@gmail.com | amit@0965 |
Then User should be on homepage