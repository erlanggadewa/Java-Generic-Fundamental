package com.practice.application;

import com.practice.MyData;

/*
    * Wildcard
        - Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
        - Misal kita hanya ingin mem-print data T, tidak peduli tipe apapun
        - Jika kita mengalami kasus seperti ini, kita bisa menggunakan wildcard
        - Wildcard bisa dibuat dengan mengganti generic parameter type dengan karakter ?
 */

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Erlangga"));
        print(new MyData<MultipleConstraintApp.VicePresident>(new MultipleConstraintApp.VicePresident()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
