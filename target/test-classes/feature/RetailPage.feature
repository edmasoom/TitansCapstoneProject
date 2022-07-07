

Feature: Retail Page Feature
# this feature, you have to have an existing account
#passed
Background: 
Given User is on Retail Website 
And User click on MyAccount 
When User click on Login 
And User enter username 'edrees@ed.com' and password '12345' 
And User click on Login button 
Then User should be logged in to MyAccount dashboard 

#passed
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link
And User fill affiliate form with below information 
|company|website|taxID|paymentMethod|payeeName| 
|retailTest|retail@test.com|123|Cheque|Khan|
And User check on About us check box
And User click on Continue button 
Then User should see a success message  


#passed
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
When User click on 'Edit your affiliate information'link
And User click on Bank Transfer radio button 
And User fill Bank information with below information 
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Kabul|123123|0101|EditedAccount|4444|
And User click on Continue button 
Then User should see a success message 

#passed
@test
Scenario: Edit your account Information 
When User clic on 'Edit your account information' link 
And User modify below information 
|firstName|lastName|email|telephone|
|Walid|Mahammod|edrees@ed.com|121212|
And User click on Continue button 
Then User should see a message retail 'Success: Your account has been successfully updated.' 
