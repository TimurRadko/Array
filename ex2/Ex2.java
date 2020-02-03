package com.timurradko.ex2;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        System.out.println();
        bubbleSort(array);
        System.out.println("Sorted array:");
        printArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                System.out.println("The smallest number: " + array[i]);
                System.out.println("The second smaller number: " + array[i + 1]);
                break;
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
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
