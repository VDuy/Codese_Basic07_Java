package com.company.thuattoancoban;

import java.util.Arrays;
import java.util.Scanner;

public class b2sapxep {
    public static void main(String[] args) {
        System.out.println(" Viết 2 hàm sắp xếp mảng các số nguyên sử dụng 2 thuật toán sau:" +
                " Buble sort, Insertion sort.");

        int arr[] = new int[]{2, 4, 3, 6, 7, 8, 1, 9, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("sap xep insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }

        arr = new int[]{2, 4, 3, 6, 7, 8, 1, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nBuble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nSap xep chuoi");
        String original = sc.nextLine();
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);

        System.out.println("\n====");
        String strA = sc.nextLine();
    }
}

