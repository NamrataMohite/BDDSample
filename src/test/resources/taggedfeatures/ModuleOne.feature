
@PhaseOne
Feature: CRM Contact & Deal Feature

@RegressionTest
Scenario: Create Contact
Given User is loggedIn
When USer create a new contact

Scenario: View contact
Given User is loggedIn
When User view contact details

@SmokeTest
Scenario: Update  contact
Given User is loggedIn
When User update a contact details

Scenario: Create deal
Given User is loggedIn
When USer create a new deal

@RegressionTest
Scenario: View deal
Given User is loggedIn
When User view Deal details

@SmokeTest
Scenario: update deal
Given User is loggedIn
When User update a Deal details

Scenario: Logout
When User logout from app

