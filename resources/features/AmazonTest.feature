Feature: Amazon Test
This feature verifies the functionality of searching for Nikon on Amazon.com, sorting results and checking selected product details

Scenario: Check if it's possible to search for Nikon on Amazon.com, sort results and check details of selected product
Given Amazon.com page is opened
When I search for Nikon products
And I sort results from Highest to Lowest Price
And I select second product
Then product detail page is opened and product title is checked