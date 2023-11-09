Feature: Adding Current Job Details for Employees

  Scenario: Admin adds job details for an employee

    Given user is navigated to HRMS application
    When user enters admin username and password
    When user clicks on login button
    Then user is successfully logged in
    When user clicks on Admin option
    Then user navigate to the EmployeeList
    When user enters valid employee name
    Then user navigate to the employee's profile
    Then user clicks on Job Title
    Then user navigate to the current job details section
    Then user clicks on Employment Status
    Then user clicks on Job Category
    Then user clicks on Joined Date
    Then user clicks on Sub Unit
    Then user clicks on Location
    Then user clicks on Start Date
    Then user clicks on End Date
    Then user clicks on Contract Details
    Then user clicks on Save Button














