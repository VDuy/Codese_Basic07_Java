package com.company.thuattoancoban;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class b5demsolanxuathien {
    public static void main(String[] args) {
        int n, x, count = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu mang: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap mang: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Chon phan tu: ");
        x = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("So lan phan tu " + x + " xuat hien: " + count);
    }
}