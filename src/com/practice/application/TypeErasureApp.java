package com.practice.application;

import com.practice.MyData;

/*
    * Type Erasure
        - Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan
            pengecekan pada saat runtime
        - Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita
            telah di compile menjadi binary file
        - Compiler akan mengubah generic parameter type menjadi tipe Object di Java
    * Problem Type Erasure
        - Karena informasi generic hilang ketika sudah menjadi binary file
        - Oleh karena itu, konversi tipe dåta generic akan berbahaya jika dilakul<an secara tidak bijak
 */

public class TypeErasureApp {
    public static void main(String[] args) {
        /*
            Kode dibawah ini nampaknya berjalan baik, akan tetapi akan muncul error ketika runtime
         */

        MyData myData = new MyData("Hello");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;

        Integer intData = integerMyData.getData();

    }
}
