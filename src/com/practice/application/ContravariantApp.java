package com.practice.application;

import com.practice.MyData;

/*
    * Contravariant
        - Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
        - Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
        - Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>
        - Contravariant adalah bisa write dan read, namun perlu berhati-hati ketika melakukan read,
          terutama jika sampai parent nya punya banyak child
 */


public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Hello");
        objectMyData.setData(1000); // ERROR Contravariant terjadi karena kita melakukan setting data ke Integer

        process(objectMyData);


    }

    public static void process(MyData<? super String> myData) {
        /*
        Kemudian disini dilakukan proses casting tipe menjadi String.
        Tidak akan error jika yang di passing sebuah data yang bernilai String
         */
        String value = (String) myData.getData();
        System.out.println(value);
    }
}
