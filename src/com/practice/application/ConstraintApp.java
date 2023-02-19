package com.practice.application;

/*
    * Bounded Type Parameter
        - Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
        - Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang
            diperbolehkan
        - Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau
            class-class turunannya
        - Secara default, constraint type untuk generic parameter type adalah Object, sehingga semua tipe
            data bisa digunakan
 */


public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> numberData = new NumberData<>(10);
//        NumberData<String> stringNumberData = new NumberData<>("10"); -> ERROR - String is not a subclass of Number
        System.out.println(numberData.getData());
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
