

Feature: Retail Page Feature
# this feature, you have to have an existing account

Background: 
Given User is on Retail Website 
And User click on MyAccount 
When User click on Login 
And User enter username 'ed@ed.com' and password '12345' 
And User click on Login button 
Then User should be logged in to MyAccount dashboard 

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link
And User fill affiliate form with below information 
|company|website|taxID|paymentMethod|payeeName| 
|retailTest|retail@test.com|123|Cheque|Khan|
And User check on About us check box
And User click on Continue button 
Then User should see a success message 



Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
When User click on 'Edit your affiliate information'link
And User click on Bank Transfer radio button 
And User fill Bank information with below information 
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Chase|120|4545|ChaseNewAccount|123123123|
And User click on Continue button 
Then User should see a success message


Scenario: Edit your accoun Information 
When User clic on 'Edit your account information' link 
And User modify below information 
|firstName|lastName|email|telephone|
|Ahamd|Mahammod|King@yahoo.com|121212|
And User click on Continue button 
Then User should see a message 'Success: Your account has been successfully updated.' 
