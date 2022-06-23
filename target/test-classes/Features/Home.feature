@completeTest
Feature: Retail Test Environment

  # Every feature starts with word Feature: <Name of Feature file>
  # Every feature file has extension .feature and it is all lower case
  # Every Test case is a scenario in feature file
  # Each scenario starts with word Scenario: <Name of the Scenario>
  # Each Scenario starts with Gherkin Keywords
  # Given When And Then
  @login @Regression
  Scenario: login to Test Environment
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option
    And User enter userName "cali.titans@tekschool.us" and password "cali123"
    And User click on login button
    Then User should be logged into myAccount page

  @login @Regression @smokeTest
  Scenario: login to Test Environment
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option
    And User enter userName "test.test@gmail.com" and password "123456"
    And User click on login button
    Then User should be logged into myAccount page

  @login @Regression
  Scenario: login to Test Environment
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option
    And User enter userName "test.test@yahoo.com" and password "123456"
    And User click on login button
    Then User should be logged into myAccount page
    
	@smokeTest  @Regression
  Scenario Outline: login with multiple users
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option
    And User enter userName "<userName>" and password "<password>"
    And User click on login button
    Then User should be logged into myAccount page

    Examples: 
      | userName                 | password |
      | cali.titans@tekschool.us | cali123  |
      | test.test@yahoo.com      |   123456 |
      | test.test@gmail.com      |   123456 |

  
  Scenario: login to Test Environment
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option
    And User enter userName "test.test@yahoo.com" and password "123456"
    And User click on login button
    Then User should be logged into myAccount page
      