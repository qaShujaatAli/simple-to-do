Feature: Simple ToDo App

  @SimpleToDo
  Scenario: Verify that user is able to Launch App and Add a new task
    Given [ToDo Home Page] SimpleToDo App must be launched successfully

  @SimpleToDo @SimpleEmptyTask
  Scenario: Verify that the app disallows adding an empty task
    When  [ToDo Home Page] User taps on Task description
    And   [ToDo Home Page] User taps on Add Task
    Then  [ToDo Home Page] Verify user must NOT be allowed to create an empty Task

  @SimpleToDo @SimpleAddTask
  Scenario: Verify that user is able to Add a new task
    When  [ToDo Home Page] User add a new Task "ToDo - Task One"
    And   [ToDo Home Page] User taps on Add Task
    Then  [ToDo Home Page] Verify Task "ToDo - Task One" has been added successfully

  @SimpleToDo @SimpleMarkTaskDone
  Scenario: Verify that user is able to mark a task as completed
    And   [ToDo Home Page] User marks Task as completed

  @SimpleToDo @SimpleTaskDelete
  Scenario: Verify that user is able to Delete a task
    And   [ToDo Home Page] User deletes a Task
    Then  [ToDo Home Page] Verify Task "ToDo - Task One" is Deleted successfully






