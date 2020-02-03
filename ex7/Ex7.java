package com.timurradko.ex7;

import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        searchNonRepeating(array);
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Your created array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void searchNonRepeating(int[] array) {
        System.out.println("Non repeating array elements:");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (value != array[j]) {
                    count++;
                }
            }
            if (array.length - 1 == count) {
                System.out.print(value + " ");
            }
        }
    }
}
