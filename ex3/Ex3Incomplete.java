package com.timurradko.ex3;

import java.util.Random;
import java.util.Scanner;

public class Ex3Incomplete {
    private static int sc;
    public static void main(String[] args) {
        checkInt();
        System.out.println();
        System.out.println("Create new Array");
        int[] array = new int[sc];
        initRandomArray(array);
    }

    private static void checkInt() {
        System.out.println("Enter integer number, please:");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("You entered the wrong number! Enter Valid (Integer) Number!");
            sc.nextInt();
        }
        System.out.println("You Enter Valid Number. This number will become the size the new Array");
    }

    private static void initRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
    }


}
