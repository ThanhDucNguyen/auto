
Feature: In order to add customer so that the system has the customer successfully

  Scenario Outline: Add the customer successfully
    Given I open the Customer Page <website>
    Then I verify the add customer screen in bank
    When I type first name <firstname> , last name <lastname> , postcode <postcode>
    Then I click submit button <status>
    Then I check the customer has added in the list

    Examples:
      | website                                                                        | firstname | lastname | postcode | status |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust | Hue       | Thai     | 084      | true   |



  Scenario Outline: Add the customer successfully
    When I type first name <firstname> , last name <lastname> , postcode <postcode>
    Then I click submit button <status>
    Then I check the customer has added in the list
    Then I check the customer has added in the list

    Examples:
      | website                                                                        | firstname | lastname | postcode | status |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust | Hue       | Thai     | 084      | true   |