# User stories

## Case #1: Process average based on 3 scores
### 1# Acceptance Criteria
GIVEN Matilda insert 3 scores

WHEN system process their average

Then the average is returned

### 2# Acceptance Criteria
GIVEN Matilda insert more than 3 scores

WHEN system is call to process their average

THEN the message INSERT 3 SCORES is shown

### 3# Acceptance Criteria
GIVEN Matilda insert less than 3 scores

WHEN system is call to process their average

THEN the message INSERT 3 SCORES is shown

### 4# Acceptance Criteria
GIVEN Matilda insert a grade less than zero

WHEN system is call to process average

THEN the message SCORE INCORRECT is shown


### 5# Acceptance Criteria
GIVEN Matilda insert a score greater than 10.0

WHEN system is call to process average

THEN the message SCORE INCORRECT is shown

## Case #2: Show if scores average is approved or not
### 1# Acceptance Criteria
GIVEN Matilda insert 3 scores

WHEN the average is greater or equal to 5.0

THEN a message with APPROVED is shown
### 2# Acceptance Criteria
GIVEN Matilda insert 3 scores

WHEN the average is less than 5

THEN a message with NOT APPROVED is shown

## Case #3: Show when retake exam is necessary
GIVEN Matilda insert 3 scores

WHEN one of scores is less than 3

THEN a message with RETAKE EXAM is shown

## Case #4: Show REPROVED if it has more than one grade less than 3.
GIVEN Matilda insert 3 scores

WHEN more than one score is less than 3

THEN a message with NOT APPROVED is shown

## Case #5: Show APPROVED in a special case
GIVEN Matilda insert 3 scores with one less than 3

WHEN the average is greater or equal to 7

THEN a message with APPROVED is shown
