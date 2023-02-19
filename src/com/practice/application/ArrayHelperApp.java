package com.practice.application;

import com.practice.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] arrStr = {"Hello", "World", "Java", "C++", "C#"};
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayHelper.printArray(arrStr);
        ArrayHelper.printArray(arrInt);

        System.out.println("Length array of String: " + ArrayHelper.count(arrStr));
        System.out.println("Length array of Integer: " + ArrayHelper.count(arrInt));
    }
}
