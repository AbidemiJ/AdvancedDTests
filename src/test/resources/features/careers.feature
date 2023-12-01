Feature: Careers

  Scenario: Validate CV Upload in Careers

    Given I navigate to the ReteIcons Website
    And I click on the resources hyperlink on the header
    And I click on careers from the resources drop down menu
    And I am redirected to another page with a form
    And I fill the first name field
    And I fill the last name field
    And I enter email address
    And I enter phone number
    And I upload my CV
    And I see a text under the CV upload bar that says that We accept MS Word PDF & Rich Text Format
    And I fill the role field
    And I fill the LinkedIn url field
    And I type a message in the cover letter field
    And I tick the privacy policy check box
    When I click on the submit button
    Then the form is successfully submitted and cv uploaded successfully message is displayed
