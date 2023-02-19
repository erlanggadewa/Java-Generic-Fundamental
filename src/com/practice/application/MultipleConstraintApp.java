package com.practice.application;

/*
    * Multiple Bounded Type Parameter
        - Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
        - Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
        - Jika ingin menambahlkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi
 */


public class MultipleConstraintApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<>(new Manager()); // ERROR type not in bound
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
        System.out.println(vicePresidentData.getData().getName());
        vicePresidentData.getData().fireEmployee("John Doe");
    }

    public interface CanFireEmployee {
        void fireEmployee(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {
    }

    public static class VicePresident extends Employee implements CanFireEmployee {


        public String getName() {
            return "ERLANGGA";
        }

        @Override
        public void fireEmployee(String name) {
            System.out.println("Firing employee: " + name);
        }

    }

    public static class Data<T extends Employee & CanFireEmployee> {
        public T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T data) {
            this.data = data;
            this.data.fireEmployee("John Doe");
        }
    }
}
