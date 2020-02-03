package com.timurradko.ex6;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        int average = averageArray(array);
        searchLessThanAverage(array, average);
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("You new array on Display:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int averageArray(int[] array) {
        System.out.println("Arithmetic mean of array:");
        int sumOfValue = 0;
        int count = 0;
        for (int valueArray : array) {
            sumOfValue = sumOfValue + valueArray;
            count++;
        }
        int average = sumOfValue / count;
        System.out.println(average);
        return average;
    }

    private static void searchLessThanAverage(int[] array, int average) {
        System.out.println("Value less than average:");
        for (int value : array) {
            if (value < average) {
                System.out.print(value + " ");
            }
        }
    }
}
