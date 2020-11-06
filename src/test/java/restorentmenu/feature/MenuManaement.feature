#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Menu Management 

@SmokeTest
Scenario: Add a menu item
Given I have a munu item with name "cucumber sandwitch" and price 20
When I add that menu item
Then menu item with name "cucumber sandwitch" should be added

@RegularTest
Scenario: Add a menu item
Given I have a munu item with name "cucumber sandwitch" and price 15
When I add that menu item
Then menu item with name "cucumber sandwitch" should be added

@NightltBuildTest @RegularTest
Scenario: Add a menu item
Given I have a munu item with name "paneer butter masala" and price 20
When I add that menu item
Then menu item with name "paneer butter masala" should be added