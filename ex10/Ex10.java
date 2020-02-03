package com.timurradko.ex10;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array);
        System.out.println("Your new array:");
        printArray(array);
        invertingArray(array);
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

    private static void invertingArray(int[] array) {
        System.out.println();
        System.out.println("You inverted array:");
        int[] invertedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            invertedArray[array.length - 1 - i] = array[i];
        }
        printArray(invertedArray);
    }

}

