Feature: Test Google

  Scenario: Verify Google homepage title
    Given I open Google
    Then the title should be "Google"
