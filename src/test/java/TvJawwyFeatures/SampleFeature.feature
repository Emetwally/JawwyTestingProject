#sampletesting.feature
Feature: Verify sample tests for home and login screen
#Background: 
#Given Jawwytv site opens successfully
#When User changes language in welcome screen
#And User clicks on seven days free subscribe now button
#with Examples Keyword i will pass the username and password parameters
#Also i will combine username and password in one step 
@bottomtest 
Scenario Outline: Validate back button on payment screen
	Given Jawwy homepage open successfully
	And user enters "<username>" 
	And user enters "<password>" also clicks on continue button
	Then user should see back button displayed on payment screen

Examples:
	| username | password |
	| testuser@gm.com  | 12345678 |

@toptest
Scenario: Validate that one single payment method is available for Lebanon country
	Given Jawwy homepage open successfully
	And user enters "<username>" 
	And user enters "<password>" also clicks on continue button
	And User should selects Lebanon from country dropdown menu
	Then user should see only one payment options


@toptest
Scenario: Validate that two payment method is available for Bahrain country
	Given Jawwy homepage open successfully
	And user enters "<username>" 
	And user enters "<password>" also clicks on continue button
	And User should selects Bahrain from country dropdown menu
	Then user should see two payment options



@bottomtest
Scenario: Validate user navigates back to subscribe now page
	Given Jawwy homepage open successfully
	And user enters "<username>"
	And user enters "<password>" also clicks on continue button
	And user navigates back to subscribe now page
	And user clicks on Click here link in create your account section
	And user clicks on Subscribe link in Existing User section
	Then user should redirect to subscribe screen



@bottomtest
Scenario: Validate terms and conditions page
	Given Jawwy homepage open successfully
	And user clicks on Terms and Conditions link in create your account section
	Then user should see that Terms and Conditions section is displayed