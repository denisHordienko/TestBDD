@Story_BookSearch @ST_678402930
Featre: Book search
  To allow a customer to find his favourite books quickly, the library must offer multiple ways to search for a book.

Background:
Given a $100 microwave was sold on 2015-11-03
And today is 2015-11-18

@Critical @Test_1 @SC_678418582
Scenario: Search books by publication year
Given a book with the title 'One good book', written by 'Anonymous', published in 14 March 2013
And another book with the title 'Some other book', written by 'Tim Tomson', published in 23 August 2014
And another book with the title 'How to cook a dino', written by 'Fred Flintstone', published in 01 January 2012
When the customer searches for books published between 2013 and 2014
Then 2 books should have been found
And Book 1 should have the title 'Some other book'
And Book 2 should have the title 'One good book'
Then i want do smth with "smth"


  @some
Scenario Outline: some
    Given gsighasf
    Then casdcvmam <\d@as> <as>

    Examples:
      | \d@as | as | salary |
      | 1 | donald | 60000.0 |
      | 2 | dewie | 62000.0 |
      | 3 | goofy | 66000.0 |
      | 4 | scrooge | 70000.0 |
      | 5 | daisy | 56000.0 |
      | 6 | minnie | 62000.0 |
      | 7 | mickey | 51000.0 |
      | 8 | fethry | 66500.0 |




