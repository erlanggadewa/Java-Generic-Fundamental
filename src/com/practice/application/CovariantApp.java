package com.practice.application;

import com.practice.MyData;

/*  * Covariant
        - Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
        - Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci
        (? extends ParentClass)
        - Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi
        Contoh<? extends Object>
        - Covariant adalah read-only, jadi kita tidak bisa mengubah data generic nya
 */

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Hello");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData()); // * Read data di covariant boleh dilakukan

//        myData.setData(1000); -> ERROR Covariant
    }
}
