@PhaseTwo
Feature: CRM Tasks Feature

Background: user Login                           #Background is used at feature level if u want to set the same behaviour before starting scenario then will use background
#Given User is loggedIn

@RegressionTest
Scenario: Create Tasks
Given User is loggedIn
When USer create a new Tasks


Scenario: View Tasks
Given User is loggedIn
When User view Tasks details

@SmokeTest
Scenario: Update  Tasks
Given User is loggedIn
When User update a Tasks details