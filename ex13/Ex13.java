package com.timurradko.ex13;

import com.timurradko.Util;

public class Ex13 {

    public static void main(String[] args) {
        String lisStr = "java\nlanguage\nprogramming\nversion\nposition\nenglish\nlesson\nsetup";
        String[] list = lisStr.split("\n");
        Util.printArray(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                String s1 = list[j];
                String s2 = list[j + 1];
                int compare = compareTo(s1, s2);
                if (compare > 0) {
                    switchPlaces(list, j, j + 1);
                }
            }
        }
        System.out.println();
        Util.printArray(list);
    }

    private static void switchPlaces(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int compareTo(String s1, String s2) {
        int i = 0;
        int minLength = min(s1.length(), s2.length());
        while (i < minLength) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int charCompare = compareTo(c1, c2);
            if (charCompare > 0) {
                return 1;
            } else if (charCompare < 0) {
                return -1;
            }
            i++;
        }
        int lengthCompare = compareTo(s1.length(), s2.length());
        return lengthCompare;
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    private static int compareTo(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}

