@Stack
Feature: DS Portal Stack Page Functionality
  
  Background: Successful login with valid credentials
    Given The User navigates to the login page
    When The User valid credentials and clicks the login button
    Then The User should be navigated to the Home page and logged in


  @StackGetStarted @StackTC_001
  Scenario: validate the stack page
    Given the user is in homepage and logged in
    When user clicks the get started button under stack section
    Then user views the stack page
    
  @StackOperationsInStack @StackTC_002  
  Scenario: validate the Operations in stack page
    Given the user is in stack page
    When user clicks the Operations in Stack link under the topics covered section
    Then user views the Operations in stack page
  
  @TryHereOperationsInStack @StackTC_003
  Scenario: validate the Try here page from Operations in stack page
    Given the User is on the Operations in stack page
    When the User clicks the Try here in Operations in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorOperationsInStack @StackTC_004  
  Scenario Outline: validate the Try editor from Operations in stack page
    Given the User is on the Try Editor page through the operations in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen
    
    Examples:
    | code         | output     |
    |print\"Hello\"|Hello       | 
    |              |            | 
    |hi            |            |
    |aer234@$      |            |
    
    #|hi| NameError: name 'hi' is not defined on line 1|
    #|1234| |
    #|System.out.println();|NameError: name 'System' is not defined on line 1|
    #
    #
  @StackImplementationInStack @StackTC_005   
  Scenario: validate the Implementation in stack page
    Given the user is in stack page
    When user clicks the Implementation in Stack link under the topics covered section
    Then user views the Implementation in stack page
  
  @TryHereImplementationInStack @StackTC_006  
  Scenario: validate the Try here page from Implementation in stack page
    Given the User is on the Implementation in stack page
    When the User clicks the Try here in Implementation in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorImplementationInStack @StackTC_007   
  Scenario Outline: validate the Try editor from Implementation in stack page
    Given the User is on the Try Editor page through the implementation in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen
    
    Examples:
    | code         | output     |
    |print\"Hello\"|Hello       | 
    |              |            | 
    |hi            |            |
    |aer234@$      |            |
    
    
  @StackApplicationsInStack @StackTC_008   
  Scenario: validate the Applications in stack page
    Given the user is in stack page
    When user clicks the Applications in Stack link under the topics covered section
    Then user views the Applications in stack page
  
  @TryHereApplicationsInStack @StackTC_009  
  Scenario: validate the Try here page from Applications in stack page
    Given the User is on the Applications in stack page
    When the User clicks the Try here in Applications in stack Page
    Then the User should get navigated to the Try Editor Page
  
  @TryEditorApplicationsInStack @StackTC_010  
  Scenario Outline: validate the Try editor from Applications in stack page
    Given the User is on the Try Editor page through the applications in stack page
    When the User enters a sample code as "<code>" in the Editor section and click Run
    Then the User should get the "<output>" in the screen
    
    Examples:
    | code         | output     |
    |print\"Hello\"|Hello       | 
    |              |            | 
    |hi            |            |
    |aer234@$      |            |
    
    
   @PracticeOperations @StackTC_011 
   Scenario: validate the Stack practice questions page from Operations in stack page
    Given the User is on the Operations in stack page
    When the User clicks the Practice Questions link in Operations in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    @PracticeImplementation @StackTC_012 
   Scenario: validate the Stack practice questions page from Implementation in stack page
    Given the User is on the Implementation in stack page
    When the User clicks the Practice Questions link in Implementation in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    @PracticeApplication @StackTC_013 
   Scenario: validate the Stack practice questions page from Applications of stack page
    Given the User is on the Applications in stack page
    When the User clicks the Practice Questions link in Applications in stack Page
    Then the User should get navigated to the Stack Practice Questions Page
    
    
    