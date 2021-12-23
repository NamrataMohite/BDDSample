Feature: CRM Login Feature

#Scenario: Valid Login
#Given User is on Login page
#When User enters login credentials
#Then User is on home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User is on home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then User is on home page

#Examples:
#|username | password |
#|Testuser1 | welcome123 |
#|Testuser2 | welcome123 |
#|Testuser3 | welcome123 |
#|tomsmith | SuperSecretPassword! |

#Scenario: create a contact
#Given User is on login page
#And user loggedIn
#"tomsmith" "SuperSecretPassword!"
#And User navigates to contact page
#When User Enters contact details
#firstname,lastname,address....

Scenario: Valid Login
Given User is on Login page
When User enters login credentials
| username | password |
| tomsmith | SuperSecretPassword! |
Then User is on home page

 


