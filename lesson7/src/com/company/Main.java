package com.company;

/**
 * 4 tinh chat oop
 * - Abstraction- truu tuong
 * - Inheritance -
 * - Encapsulation
 * - Polymorphism
 */

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(123);
        Student s4 = new Student("Vu Duc Duy");

        s1.MSSV = 10;
        s2.MSSV = 20;

        s1.setMSSV(10);
        s2.setMSSV(20);
        s2.setMSSV("20");


    }
}
