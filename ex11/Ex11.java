package com.timurradko.ex11;

import java.sql.SQLOutput;
import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        System.out.println("Your new array:");
        printArray(array);
        // При ввводе положительного значения значения в массиве сдвигаются вправо, иначе - влево
        arrayShift(array, -5);

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

    private static void arrayShift(int[] array, int arrayShift) {
        System.out.println();
        System.out.println("Shifted array:");
        if (arrayShift > 0) {
            for (int i = 1; i <= arrayShift; i++) {
                for (int j = array.length - 1; j >= 0; j--) {
                    if (j - 1 < 0) {
                        array[j] = 0;
                    } else {
                        array[j] = array[j - 1];
                    }
                }
                printArray(array);
                System.out.println();
            }
        }
        if (arrayShift < 0) {
            for (int i = 1; i <= arrayShift * (-1); i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (j + 1 > array.length) {
                        array[j + 1] = 0;
                    }
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
                printArray(array);
                System.out.println();
            }
        }
    }
}

