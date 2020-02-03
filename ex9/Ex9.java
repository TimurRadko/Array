package com.timurradko.ex9;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        int countMax = searchMax(array);
        int countMin = searchMin(array);
        System.out.println("Results of exercise:");
        if (countMin < countMax) {
            for (int i = countMin; i <= countMax; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = countMax; i <= countMin; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }
    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
    private static void printArray(int[] array) {
        System.out.println("You random array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    private static int searchMax(int[] array) {
        int max = array[0];
        int count = 0;
        int countMax = 0;
        for (int value : array) {
            if (max < value) {
                max = value;
                countMax = count;
            }
            count++;
        }
        return countMax;
    }

    private static int searchMin(int[] array) {
        int min = array[0];
        int count = 0;
        int countMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                countMin = count;
            }
            count++;
        }
        return countMin;
    }

}
