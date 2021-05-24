package com.company.buoi1;

import java.util.Scanner;

public class songuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("So phan tu mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap vao mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Co: " + count + " phan tu chia het cho 3");

        System.out.println("Nhap 2 so nguyen duong: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("UCLN là: " + a);
        } else {
            System.out.println("UCLN là: " + UCLN(a, b));
        }
        System.out.println("BCNN là: " + BCNN(a, b));

        System.out.println("cac so hoan hao nho hon 10^9");
        int sum = 0;
        for (int i = 1; i < Math.pow(10, 9); i++) {
            for (int j = 1; j < i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }

            sum = 0;
        }
    }

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else b = b - a;
        }
        return a;

    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

}

