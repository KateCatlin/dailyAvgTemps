package com.dailyAveTemps.java;

/**
 * Created by katecatlin on 9/18/14.
 */
public class dailyAverageTemps {

    public static int dailyAverageTemps [] = {63, 73, 83, 93};

    public static void main(String[] args) {


        double weekAverage = findWeekAverage();
        System.out.println(weekAverage);

    }

    public static double findWeekAverage () {
        double sum = 0;
        double weekAverage = 0;
        int i = 0;

        for (int x : dailyAverageTemps) {
            sum +=x;
        }
        weekAverage = sum / dailyAverageTemps.length;

        return weekAverage;
    }
}
