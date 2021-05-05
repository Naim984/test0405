Feature: Fun with Selenium - Solving Ria

  @test1
  Scenario: test text empty
    Given enter the home page
    When the user enter text
    Then the result is correct empty

  @test2
  Scenario: Test text valid
    Given enter the home page
    When the user enter text valid
    Then the text result is correct

  @test3
  Scenario: Test text valid result bold
    Given enter the home page
    When user enters text and makes it bold
    Then the result is correct

####New Scenario###
  @test4
  Scenario Outline: Test text valid result bold scenario online
    Given enter the home page
    When user enters text and makes it bold test <text>
    Then the result is correct
    Examples:
      | text      |
      | BDD       |
      | Selenium  |
      | Cucumber  |
