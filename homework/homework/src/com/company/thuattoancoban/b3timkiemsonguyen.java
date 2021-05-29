package com.company.thuattoancoban;

import java.util.Scanner;

// Viết hàm tìm kiếm 1 số nguyên trong một mảng, in ra -1 nếu không tìm thấy.
// tìm thấy thì in ra chỉ số của phần tử đó.


public class b3timkiemsonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        System.out.print("So phan tu mang: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("So can tim ");
        k = scanner.nextInt();
        checknum(arr, n, k);
    }

    public static void checknum(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println(" vi tri: " + (i + 1));
                return;
            }
        }
        System.out.println(-1);
    }
}
