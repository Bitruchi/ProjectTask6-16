Feature: Adding Current Job Details for Employees

  Scenario: Admin adds job details for an employee
    Given I am an admin
    When I log in to the system
    And I navigate to the employee's profile
    And I add current job details for the employee
    Then the job details should be saved successfully
