package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("BT1: Nhap vao chuoi, in ra so chia het cho 3: ");
        int[] list = new int[10];
        int i;
        System.out.println("\n Nhap chuoi 10 so");
        while (true) {
            try {
                for (i = 0; i < list.length; i++) {
                    list[i] = sc.nextInt();
                    System.out.println(" so thu " + (i + 1) + ": " + list[i]);
                }
                break;
            } catch (Exception e) {
                sc.next();
                System.out.println("nhap lai so nguyen tu dau");
            }
        }
        System.out.println(" Cac so chia het cho 3: ");
        for (i = 0; i < list.length; i++) {
            if (list[i] % 3 == 0) {
                System.out.println(list[i]);
            }
        }

        System.out.println("\nBT2: Nhap 2 so nguyen duong, in ra uoc, UCLN, BCNN: ");
        System.out.println(" Nhap vao a: ");
        int a = sc.nextInt();
        System.out.println(" Nhap vao b: ");
        int b = sc.nextInt();
        System.out.println(" USCLN của " + a + " và " + b
                + " là: " + UCLN(a, b));
        System.out.println(" BSCNN của " + a + " và " + b
                + " là: " + BCNN(a, b));


        System.out.println("\nBT3: So hoan hao");
        Main perfectnum = new Main();
        for (int j = 1; j < 1000000000; j++) {
            if (perfectnum.shh(j))
                System.out.println(j);
        }
    }

    public static int UCLN(int a, int b) {
        int t1 = a, t2 = b;
        while (t1 != t2) {
            if (t1 > t2) {
                t1 -= t2;
            } else {
                t2 -= t1;
            }
        }
        int UCLN = t1;
        return UCLN;
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }


    public boolean shh(int n) {
        int sum = 0;
        for (int j = 1; sum <= n && j < n; j++) {
            if (n % j == 0) sum += j;
            if (sum == n) return true;
        }
        return false;
    }

}





