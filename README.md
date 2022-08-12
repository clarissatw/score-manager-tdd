# User stories

## Case #1: Process average based on 3 grades
Given Matilda insert 3 scores
When system process their average
Then the average is returned

Given Matilda insert more than 3 scores
When system is call to process their average
Then the message INSERT 3 SCORES is shown

Given Matilda insert less than 3 scores
When system is call to process their average
Then the message INSERT 3 SCORES is shown

Given Matilda insert a grade less than zero
When system is call to process average
Then the message SCORE INCORRECT is shown

Given Matilda insert a grade greater than ten
When system is call to process average
Then the message SCORE INCORRECT is shown

## Case #2: Show if scores average is approved or not
Given Matilda insert 3 scores
When the average is greater or equal to 5
Then a message with APPROVED is shown

Given Matilda insert 3 scores
When the average is less than 5
Then a message with NOT APPROVED is shown

## Case #3: Show when retake exam is necessary
Given Matilda insert 3 scores
When one of scores is less than 3
Then a message with RETAKE EXAM is shown

## Case #4: Show REPROVED if it has more than one grade less than 3.
Given Matilda insert 3 scores
When more than one score is less than 3
Then a message with NOT APPROVED is shown

## Case #5: Show APPROVED in a special case
Given Matilda insert 3 scores with one less than 3
When the average is greater or equal to 7
Then a message with APPROVED is shown