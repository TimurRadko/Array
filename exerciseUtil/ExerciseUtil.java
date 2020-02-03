package com.timurradko.exerciseUtil;

import com.timurradko.Util;

public class ExerciseUtil {

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Util.initRandomArray(array);
        Util.printArray(array);
    }
}
