Feature: Project Feature

  Background:
    Given User Tries to manage a project or create a new one

  Scenario: Creates a new Project
   When He inputs project name: "Test"
    And  He inputs project description: "Description"
    And He inputs project ID: 1
    Then  He creates a new project

