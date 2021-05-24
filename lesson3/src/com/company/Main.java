package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        int cong = Cong(a, b);
        int tru = Tru(a, b);
//        double soLon = tinhSoLon(cong, tru);
//        double soBe = tinhSoBe(cong, tru);

//        Cong(a, b);
//        Tru(a, b);
        System.out.println(cong);
        System.out.println(tru);
    }


    public static int Cong(int a, int b) {
        return a + b;

    }

    public static int Tru(int a, int b) {
        return a - b;
    }

//    public static double tinhSoLon(int cong, int tru) {
//
//    }
//    public static double tinhSoBe(int cong, int tru) {
//
//    }
}

