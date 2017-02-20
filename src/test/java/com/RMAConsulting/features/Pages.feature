Feature: RMAHomePage
  In order to check the RMA Pages
  As a RMA User
  I want to see the relevant pages for each section


Scenario Outline: View Pages
Given I am on the RMA Homepage
When I navigate to <Section>
Then I see the Page <Page>

Examples:
| Section      | Page                   |
| about-us     | We are RMA             |
| work         | A few of our projects  |
| our-approach | Our approach           |
