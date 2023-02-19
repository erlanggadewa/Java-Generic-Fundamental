package com.practice.application;

import com.practice.MyData;


/*  ! Invariant
        Secara default, saat kita membuat generic parameter type, Sifat parameter tersebut adalah invariant
        Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
        Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>,
        begitupun sebaliknya, saat membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>
*/

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Hello");
//        MyData<Object> objectMyData = stringMyData; -> ERROR Invariant
//        doObject(stringMyData); -> ERROR Invariant


        MyData<Object> objectMyData2 = new MyData<>(1000);
//        MyData<String> stringMyData2 = objectMyData2; // -> ERROR Invariant
//        doInteger(objectMyData2); -> ERROR Invariant
    }

    public static void doObject(MyData<Object> data) {
        // do something
    }

    public static void doInteger(MyData<Integer> data) {
        // do something
    }
}
