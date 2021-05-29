package com.company.dequy;

import java.util.Scanner;

public class fibonanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Nhap so thang: ");
        for (int i = 0; i < month; i++) {
            System.out.println(dayfibonaci(i));
        }
    }
    public static int dayfibonaci(int n) {
        if (n < 2) {
            return 2;
        }
        return dayfibonaci(n - 1) + dayfibonaci(n - 2);

    }
}
