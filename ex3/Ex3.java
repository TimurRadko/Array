package com.timurradko.ex3;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        int[] arraySquared = copyThisSquared(array, 3);
        printArray(arraySquared);

    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static int[] copyThisSquared(int[] array, int squaredTo) {
        int[] arraySquared = new int[array.length];
        int initialValue;
        for (int i = 0; i < array.length; i++) {
            int valueMethod = array[i];
            int valueSquare = 1;
            for (int j = 1; j <= squaredTo; j++) {
                initialValue = valueSquare;
                valueSquare = valueMethod * initialValue;
            }
            arraySquared[i] = valueSquare;
        }
        return arraySquared;
    }
}
