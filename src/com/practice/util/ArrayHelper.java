package com.practice.util;

public class ArrayHelper {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> int count(T[] array) {
        return array.length;
    }
}
