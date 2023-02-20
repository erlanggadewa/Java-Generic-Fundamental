package com.practice.application;

import com.practice.Person;

import java.util.Arrays;

/*
    * Comparable
        - Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals
        - Bagaimana dengan operator perbandingan lainnya? Seperti kurang dari atau lebih dari?
        - Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
        - Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya
        https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html


 */

public class ComparableApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Erlangga", "Purworejo"),
                new Person("Budi", "Jakarta"),
                new Person("Andi", "Bandung"),
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
