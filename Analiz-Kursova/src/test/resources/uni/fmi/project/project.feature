Feature: Project Feature

  Background:
    Given User Tries to manage a project or create a new one

  Scenario: Creates a new Project
   When He inputs project name: "Test"
    And  He inputs project description: "Description"
    And He inputs project ID: 1
    Then  He creates a new project

  Scenario: Adds a member to project
    When User is added to project
    Then  A user is added

    Scenario: Removes a member to project
      When User is removed of project
      Then A user is removed from project

      Scenario: Adds a subproject
        When He inputs project name: "Test"
        And  He inputs project description: "Description"
        And He inputs project ID: 1
        Then  He creates a new project

        Scenario: Removes a subproject
          When he inputs project id: 1
          Then a subproject is removed

          Scenario: Adds a task
            When he inputs Task details
            Then a task is added

            Scenario: Gets all tasks
              When he requests all tasks
              Then all tasks are returned

              Scenario: Adds user as admin
                When he requests to add user as admin
                Then a user is added as admin

                Scenario:  adds user as programmer
                  When he requests to add user as programmer
                  Then a user is added as a programmer

                  Scenario: Removes user as admin
                    When he requests to remove user as admin
                    Then a user is removed from admin

                    Scenario: Removes user as programmer
                      When he requests to remove user as programmer
                      Then a user is removed from programmer


