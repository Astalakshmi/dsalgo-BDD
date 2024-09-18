@Graph
Feature: DS Portal Graph Page Functionality

  Background: Successful login with valid credentials
    Given The User navigates to the login page
    When The User valid credentials and clicks the login button
    Then The User should be navigated to the Home page and logged in

  @GraphPage @GraphTest_001
  Scenario: Validate the Graph Page
    Given The User is on the DsAlgo Portal Home page
    When The User clicks Get Started button in the Graph section
    Then The User should get navigated to the DsAlgo Portal Graph Page

  @GraphList @GraphListTest_002
  Scenario: Validate the Graph page link
    Given The User is on the Graph Page
    When The User clicks Graph link
    Then The User should get navigated to first Topic Graph Page

  @GraphTryEditor @GraphEditorTest_003
  Scenario: Validate the navigation from the first Topic Graph Page to the Try Editor page
    Given The User is on the first Topic Graph Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @GraphRepresentations @GraphRepTest_004
  Scenario: Validate the Graph Representations page
    Given The User is on the Graph Page
    When The User clicks Graph Representations link
    Then The User should get navigated to Graph Representation Page

  @GraphReprTryEditor @GraphReprEditorTest_005
  Scenario: Validate the navigation from the Graph Representation Page to the Try Editor page
    Given The User is on the Graph Representation Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @GraphPracticeQuestion @GraphQuestionTest_006
  Scenario: Validate the Practice Questions
    Given The User is on the first Topic Graph Page
    When The User clicks Practice Questions link
    Then The User should navigate to Practice Question Page

