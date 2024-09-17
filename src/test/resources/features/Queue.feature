@Queue
Feature: DS Portal Queue Page Functionality

  Background: Successful login with valid credentials
    Given The User navigates to the login page
    When The User valid credentials and clicks the login button
    Then The User should be navigated to the Home page and logged in

  @QueuePage @QueueTest_001
  Scenario: Validate the Queue Page
    Given The User is on the DsAlgo Portal Home page
    When The User clicks Get Started button in the Queue section
    Then The User should get navigated to the DsAlgo Portal Queue Page

  @QueueList @QueueListTest_002
  Scenario: Validate the Implementation of the lists page
    Given The User is on the Queue Page
    When The User clicks Implementation of Queue in Python link
    Then The User should get navigated to Implementation lists

  @QueueListTryEditor @QueueListEditorTest_003
  Scenario: Validate the navigation from the Implementation Lists page to the Try Editor page
    Given The User is on the  Implementation lists Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @DeQueue @DeQueueTest_004
  Scenario: Validate the Implementation Using Collections Dequeue
    Given The User is on the Queue Page
    When The User clicks Implementation Using Collections Dequeue link
    Then The User should get navigated to Implementation collection Page

  @DeQueueTryEditor @DeQueueEditorTest_005
  Scenario: Validate the navigation from the Implementation collection Page to the Try Editor page
    Given The User is on the Implementation collection Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @QueueArray @QueueArrayTest_006
  Scenario: Validate the Implementation using array
    Given The User is on the Queue Page
    When The User clicks Implementation using array link
    Then The User should get navigated to Implementation Array

  @QueueArrayTryEditor @QueueArrayEditorTest_007
  Scenario: Validate the navigation from the Implementation Array Page to the Try Editor page
    Given The User is on the Implementation collection Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @QueueOperation @QueueOperationTest_008
  Scenario: Validate the Queue Operations
    Given The User is on the Queue Page
    When The User clicks Queue Operations link
    Then The User should get navigated to Queue Operation Page

  @QueueOperationTryEditor @QueueOperEditorTest_009
  Scenario: Validate the navigation from the Queue Operation Page to the Try Editor page
    Given The User is on the Implementation collection Page
    When The User clicks Try Here button
    Then The User Should get navigated to Try Editor Page

  @QueuePracticeQuestion @QueueQuestionTest_010
  Scenario: Validate the Practice Questions
    Given The User is on the Implementation lists
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page
