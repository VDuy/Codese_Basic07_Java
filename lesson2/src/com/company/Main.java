package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BT1: Nhap vao chuoi, in ra so chia het cho 3: ");

        boolean flag = true;

        int[] list = new int[10];
        int i;

        for (i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }


        System.out.println("Cac so chia het cho 3: ");
        for (i = 0; i < list.length; i++) {
            if (list[i] % 3 == 0) {
                System.out.println(list[i]);
            }
        }

        System.out.println("\n Nhap 2 so nguyen duong, in ra uoc, UCLN, BCNN: ");
    }
}

