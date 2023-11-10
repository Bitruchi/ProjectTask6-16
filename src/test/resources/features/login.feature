


Feature: Admin user updates employee's current job details

  @regression @jobtester
  Scenario: Adding multiple employees
    When user enters admin username and password
    And user clicks on the login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    When user adds multiple employees from data table and user clicks on save button
 # And user clicks on save button

      | firstName | middleName | lastName |
      |park       |ji          |sung      |
      #|emile      |smith       |row       |
       #|sean       |wright      |phillips  |

    Then employees added successfully
    Then user clicks on  Job option
    Then user clicks on Edit button
#    When user clicks on Job Title field
#    Then user select Job Title
#    When user clicks on Employment Status field
#    Then user select Employment Status
#    When user clicks on Job Category field
#    Then user select Job Category
#    When user clicks on Joined Date field
#    Then user select Joined Date
#    When user clicks on Sub Unit field
#    Then user select Sub Unit
#    When user clicks on Location field
#    Then user select Location
#    When user clicks on Start Date field
#    Then user select Start Date
#    When user clicks on Start Date field
#    Then user select Start Date
#    When user clicks on Contract Details field
#    Then user select a file
    Then user clicks on save button










