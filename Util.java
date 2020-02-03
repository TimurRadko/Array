package com.timurradko;

import java.util.Random;

public class Util {
    public static Random random = new Random();

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void printArray(Object[] array) {
        for (Object value : array) {
            System.out.print(value + " ");
        }
    }

    public static void initRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
