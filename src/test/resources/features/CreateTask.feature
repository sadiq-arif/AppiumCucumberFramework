Feature: Create New Task

  Scenario: User can add new task
    Given Click Add New Task
    Given Enter Task Name
    Given Enter Task Description
    When  User click on Save Button
    Then  Task added successfully

    Scenario Outline: User can add new task with scenario outline
      Given Click Add New Task
      Given Enter "<TaskName>" and "<TaskDesc>"
      When  User click on Save Button
      Then  Task added successfully

      Examples:
      | TaskName        | TaskDesc    |
      | Cucumber Task 1 | Task 1 Desc |
      | Cucumber Task 2 | Task 2 Desc |