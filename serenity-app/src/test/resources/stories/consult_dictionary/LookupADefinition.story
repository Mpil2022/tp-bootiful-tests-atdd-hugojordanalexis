Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Looking to add '100' to the currentvalue
Given the user is on the Adder app home page
When the user add the number '100'
Then they should see the result '100'

Scenario: Looking up the definition of 'pear'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'pear'
Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
