package com.timurradko.ex4;

public class Ex4 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        System.out.println("Your created array:");
        printArray(array);
        bubbleSort(array);
        System.out.println();
        System.out.println("Sorted array:");
        printArray(array);

    }

    private static void initRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomChar(90,65);
        }
    }

    private static int randomChar(int max, int min) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            char lit = (char) array[i];
            System.out.print(lit + " ");
        }
    }

    private static void bubbleSort(int [] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
