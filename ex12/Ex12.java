package com.timurradko.ex12;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        searchForDuplicateItems(array);
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Your created array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void searchForDuplicateItems(int[] array) {
        System.out.println();
        System.out.println("Repeating array elements:");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (value != array[j]) {
                    count++;
                }
            }
            if (count != array.length - 1) {
                System.out.print(value + " ");
            }
        }
    }
}

