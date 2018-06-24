package java.eight_kyu;

import java.util.Arrays;

public class CalculateAverage {

    public static double findAverage(int[] array) {
        return (double) Arrays.stream(array).sum() / array.length;
    }

}

