package com.timurradko.ex8;

import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        printArray(array);
        int[] newArray = deleteArrayElements(array, 3, 6);
        System.out.println("New array:");
        printArray(newArray);

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
        System.out.println();
    }

    private static int[] deleteArrayElements(int[] array, int nMin, int nMax) {
        int deleteValue = nMax - nMin;
        int value;
        int[] newArray = new int[array.length - deleteValue];
        for (int i = 0; i < array.length - deleteValue; i++) {
            value = array[i];
            newArray[i] = value;
            if (i >= nMin) {
                value = array[i + deleteValue];
                newArray[i] = value;
            }
        }
        return newArray;
    }
}
