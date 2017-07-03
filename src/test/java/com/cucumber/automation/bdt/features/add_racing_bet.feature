Feature: Add horse racing bet
	In order to test add bet feature of William Hill application
	As a non-registered user
	I want to specify stake value and other conditions

Background: Flow till Horse Racing Page
	Given I am on William Hill landing page
	When I expand Racing section
	Then I see Horses link under Next To Jump section
	When I click Horses link
	Then I see Horse Racing page

Scenario: Add horse racing without logging in
	When I click on odd value button for top odd under Trending Multi
	Then I see QuickBet popup
	When I add stake value
	And I click Add to Bet Slip button
	Then QuickBet popup closes
	When I click Bet Slip
	Then I see Bet Details
	And Bet Details are correct