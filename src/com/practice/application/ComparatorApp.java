package com.practice.application;

import com.practice.Person;

import java.util.Arrays;
import java.util.Comparator;

/*
    * Comparator
        - Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable
        - Namun bagaimana jika class tersebut milik orang lain? T idak bisa kita ubah?
        - Maka kita bisa menggunakan interface generic yang bernama Comparator
        https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
 */


public class ComparatorApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Erlangga", "Purworejo"),
                new Person("Budi", "Jakarta"),
                new Person("Andi", "Bandung"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(persons, comparator);

        System.out.println(Arrays.toString(persons));
    }
}
