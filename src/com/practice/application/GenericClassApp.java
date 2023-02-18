package com.practice.application;

import com.practice.MyData;
import com.practice.Pair;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Hello World");
//         MyData<String> myData2 = new MyData<>(1) ->  Will get error, because we assign myData2 into a String, but we pass a number in there
        MyData<Integer> myData3 = new MyData<>(1);

        System.out.println(myData.getData());
        System.out.println(myData3.getData());


        Pair<String, Integer> myData4 = new Pair<>("Hello World", 1);
        System.out.println(myData4.getFirst() + " " + myData4.getSecond());
    }
}
