package com.company.buoi2;

import java.util.Arrays;
import java.util.Scanner;

//Nhập vào 1 mảng số nguyên. Thực hiện thuật toán sắp xếp và tìm kiếm trên mảng đó.
//Nhập vào mảng A và mảng B là các mảng số nguyên đã được sắp xếp.
// Gộp hai mảng đó thành 1 mảng C mà vẫn giữ nguyên thứ tự sắp xếp.
//Nhập vào 2 mảng A gồm các ký tự, mảng B gồm các chữ số.
// Lấy 1 phần tử của mảng A và 1 phần tử của mảng B in ra. Lấy tất cả các trường hợp có thể.
public class btarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        list(arr);
        System.out.println("\n sort: ");
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("nhap mang B");
        int[] arrb = new int[n];
        for (int i = 0; i < n; i++) {
            arrb[i] = sc.nextInt();
        }
        for (int i = 0; i < arrb.length; i++) {
            System.out.print(arrb[i] + " ");
        }
        System.out.println("\n sort: ");
        Arrays.sort(arrb);
        for (int b : arrb) {
            System.out.print(b + " ");
        }

    }

    public static void list(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

