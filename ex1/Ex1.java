package com.timurradko.ex1;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        System.out.println();
        parityCheck(array);
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void parityCheck(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (value % 2 == 0) {
                if (max < value) {
                    max = value;
                }
            } else if (min > value) {
                min = value;
            }
        }
        System.out.println("Maximum even number: " + max);
        System.out.println("Minimum odd number: " + min);
    }
}




