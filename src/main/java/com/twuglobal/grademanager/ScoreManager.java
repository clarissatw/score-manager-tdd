package com.twuglobal.grademanager;

import java.util.List;

public class ScoreManager {

    public static double calculateAverage(List<Double> scores) throws ScoreAverageException {
        if(scores.size() > 3) {
            throw new ScoreAverageException("INSERT 3 SCORES");
        }
        double average = scores.stream().mapToDouble(score -> score).average().orElse(0.0);
        return average;
    }
}
