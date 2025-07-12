Feature: Job Application Form Functionality

  Scenario: Submit job application with valid data
    Given I am on the job application form
    When I enter valid job application details:
      | jobOpening    | currency | country        | name     | phone       | experience | noticePeriod | currentSalary | expectedSalary |
      | QA Engineer   | USD      | Egypt          | Mostafa  | 01090589975 | 5          | 1 month       | 10000         | 15000          |
    And I check the CAPTCHA confirmation box
    Then the application should be submitted successfully

  Scenario: Submit job application with missing required fields
    Given I am on the job application form
    When I enter incomplete job application details:
      | jobOpening | currency | country | name | phone | experience | noticePeriod | currentSalary | expectedSalary |
      |            | USD      |         |      |       |            |              |               |                |
    And I do not check the CAPTCHA confirmation box
    Then I should see validation errors for all required fields

  Scenario: Submit job application with invalid salary values
    Given I am on the job application form
    When I enter job application details with invalid salary:
      | jobOpening    | currency | country | name     | phone       | experience | noticePeriod | currentSalary | expectedSalary |
      | QA Engineer   | USD      | Egypt   | Mostafa  | 01090589975 | 5          | 1 month       | abc           | xyz            |
    And I check the CAPTCHA confirmation box
    Then I should see validation errors for salary fields

  Scenario: Submit job application with invalid phone number
    Given I am on the job application form
    When I enter job application details with invalid phone:
      | jobOpening    | currency | country | name     | phone     | experience | noticePeriod | currentSalary | expectedSalary |
      | QA Engineer   | USD      | Egypt   | Mostafa  | abcdefgh  | 5          | 1 month       | 10000         | 15000          |
    And I check the CAPTCHA confirmation box
    Then I should see a validation error for phone number

  Scenario: Submit job application without selecting dropdown options
    Given I am on the job application form
    When I enter job application details without dropdown selections:
      | jobOpening | currency | country | name     | phone       | experience | noticePeriod | currentSalary | expectedSalary |
      |            |          |         | Mostafa  | 01090589975 | 5          | 1 month       | 10000         | 15000          |
    And I check the CAPTCHA confirmation box
    Then I should see validation errors for the dropdown fields
