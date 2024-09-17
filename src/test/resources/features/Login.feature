@Login
Feature: DS Portal Login Functionality

  Background: Successful login with valid credentials
    Given The User navigates to the login page
    When The User valid credentials and clicks the login button
    Then The User should be navigated to the Home page and logged in

  @Logo @logoTest_001
  Scenario: Validating the Logo of the NumpyNinja
    Given The User navigates to the Home page
    When The User should clicks Logo NumpyNinja
    Then The User should get navigated to HomePage
