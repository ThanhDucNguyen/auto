@ResetWeb @Customer
Feature: In order to add customer so that the system has the customer successfully

  Scenario Outline: Add the customer successfully
    Given I open the Customer Page <website>
    When I add customer successfully with information <firstname> <lastname> <postcode> <status>
    When I click Open Account Page
    And I choose with information <firstname> <lastname>
    And I choose the current <currency>
    And I click Process Button
    Then I verify the account opens successfully




    Examples:
      | website                                                                        | firstname | lastname | postcode | status | currency |
      | http://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust | Hue       | Thai     | 084      | true   | Pound    |