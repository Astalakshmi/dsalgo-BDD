@Queue
Feature: DS Portal Queue Page Functionality

  Background: Successful login with valid credentials
    Given The User navigates to the login page
    When The User valid credentials and clicks the login button
    Then The User should be navigated to the Home page and logged in

  @QueuePage @QueueTest_001
  Scenario: Validate the Queue Page
    Given the user is in homepage and logged in
    When The User clicks Get Started button in the Queue section
    Then The User should get navigated to the DsAlgo Portal Queue Page

  @QueueList @QueueListTest_002
  Scenario: Validate the Implementation of the lists page
    Given the user is in homepage and logged in
    When The User clicks Implementation of Queue in Python link
    Then The User should get navigated to Implementation lists

  @QueueListTryHere @QueueListTryHereTest_003
  Scenario: Validate the navigation from the Implementation Lists page to the Try Editor page
    Given The User is on the  Implementation lists Page
    When The User clicks Try Here button in Queue Implementation List Page
    Then the User should get navigated to the Try Editor Page

 
  @QueueListTryEditor @QueueListEditorTest_004
  Scenario Outline: validate the Try editor from the Implementation Lists page
    Given the User is on the Try Editor page through the Implementation Lists page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen

    Examples: 
      | code             | output |
      |                  |        |
      |print\"Hello\"    |Hello   |
      |hi                |        |

  @DeQueue @DeQueueTest_005
  Scenario: Validate the Implementation Using Collections Dequeue
    Given the user is in homepage and logged in
    When The User clicks Implementation Using Collections Dequeue link
    Then The User should get navigated to Implementation collection Page

  @DeQueueTryHere @DeQueueTryHereTest_006
  Scenario: Validate the navigation from the Implementation collection Page to the Try Editor page
    Given The User is on the Implementation collection Page
    When The User clicks Try Here button in the Implementation collection Page
    Then the User should get navigated to the Try Editor Page

  
  @DeQueueTryEditor @DeQueueEditorTest_007
  Scenario Outline: validate the Try editor from the Implementation collection Page
    Given the User is on the Try Editor page through the Implementation collection Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen

    Examples: 
      | code             | output |
      |                  |        |
      |print\"Hello\"    |Hello   |
      |hi                |        |

  
  @QueueArray @QueueArrayTest_008
  Scenario: Validate the Implementation using array
    Given the user is in homepage and logged in
    When The User clicks Implementation using array link
    Then The User should get navigated to Implementation Array

  @QueueArrayTryHere @QueueArrayTryHereTest_009
  Scenario: Validate the navigation from the Implementation Array Page to the Try Editor page
    Given The User is on the Implementation collection Array Page
    When The User clicks Try Here button in the Implementation Array Page
    Then the User should get navigated to the Try Editor Page

  @QueueArrayTryEditor @QueueArrayEditorTest_010
  Scenario Outline: validate the Try editor from the Implementation Array Page
    Given the User is on the Try Editor page through the Implementation Array Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen

    Examples: 
      | code             | output |
      |                  |        |
      |print\"Hello\"    |Hello   |
      |hi                |        |

  @QueueOperation @QueueOperationTest_011
  Scenario: Validate the Queue Operations
    Given the user is in homepage and logged in
    When The User clicks Queue Operations link
    Then The User should get navigated to Queue Operation Page

  @QueueOperationTryHere @QueueOperTryHereTest_012
  Scenario: Validate the navigation from the Queue Operation Page to the Try Editor page
    Given The User is on the Queue Operation Page
    When The User clicks Try Here button in the Queue Operation Page
    Then the User should get navigated to the Try Editor Page

  @QueueOperationTryEditor @QueueOperEditorTest_013
  Scenario Outline: validate the Try editor from the Queue Operation Page
    Given the User is on the Try Editor page through Queue Operation Page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen

    Examples: 
      | code             | output |
      |                  |        |
      |print\"Hello\"    |Hello   |
      |hi                |        |

  @QueuePracticeQuestion @QueueQuestionTest_014
  Scenario: Validate the Practice Questions
    Given The User is on the Implementation lists
    When The User clicks Practice Questions
    Then The User should navigate to queue Practice Page
