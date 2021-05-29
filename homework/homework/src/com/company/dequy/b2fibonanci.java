package com.company.dequy;

import java.util.Scanner;

public class b2fibonanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang: ");
        int month = sc.nextInt();
        System.out.println("So tho sau " + month + " thang: ");
        for (int i = 0; i < month; i++) {
            System.out.println("thang thu " + (i + 1) + ": " + dayfibonaci(i));
        }
    }

    public static int dayfibonaci(int n) {
        if (n < 2) {
            return 2;
        }
        return dayfibonaci(n - 1) + dayfibonaci(n - 2);
    }
}
