Feature: Contact Us

  Scenario: Validate contact us page

    Given I navigate to the ReteIcons website
    And I scroll to the footer of the website
    When I click on the Contact Us icon
    Then I should be redirected to the Contact Us page

  Scenario: Validate Submission

    Given I am a user on the contact us page of the ReteIcons website
    When I fill out all the mandatory fields (title, name, email address, phone number and message)
    And I click the submit button
    Then I should see a Message sent successfully displayed
