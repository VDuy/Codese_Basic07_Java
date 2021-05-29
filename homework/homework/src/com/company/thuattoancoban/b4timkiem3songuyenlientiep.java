package com.company.thuattoancoban;

import java.util.Scanner;

public class b4timkiem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 1;
        int i = 1;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                if (count == 3) {
                    System.out.println("thu tu: " + (i - 1) + " ; " + i + " ; " + (i + 1));
                    break;
                }
            } else {
                count = 1;
            }
        }
    }
}


