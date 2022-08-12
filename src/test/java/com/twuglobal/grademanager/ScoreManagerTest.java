package com.twuglobal.grademanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ScoreManagerTest {
    @Test
    public void shouldReturnAverageWhenInsert3Scores() throws ScoreAverageException {
        // given
        double score1 = 1;
        double score2 = 10;
        double score3 = 10;

        // when
        List<Double> scores = Arrays.asList(score1, score2, score3);
        double calculatedAverage = ScoreManager.calculateAverage(scores);

        //then
        double expectedAverage = 7;
        Assertions.assertEquals(expectedAverage, calculatedAverage);
    }


    @Test
    public void shouldReturnMessageInsert3ScoresWhenMoreThan3ScoresInserted() throws ScoreAverageException{
        // given
        double score1 = 1;
        double score2 = 10;
        double score3 = 10;
        double score4 = 10;
        List scores = Arrays.asList(score1,score2,score3,score4);

        //when
        ScoreAverageException exception = Assertions.assertThrows(ScoreAverageException.class, () ->{
            ScoreManager.calculateAverage(scores);
        },"ScoreAverageException was expected");

        //then
        Assertions.assertEquals("INSERT 3 SCORES", exception.getMessage());
    }

}