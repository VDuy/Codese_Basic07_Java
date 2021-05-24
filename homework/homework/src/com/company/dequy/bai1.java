package com.company.dequy;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.println(giaithua(n));
    }

    public static int giaithua(int k) {
        long fact = 1;
        if (k < 0) {
            return -1;
        } else if ((k == 0) || (k == 1)) {
            return 1;
        } else {
            return k * giaithua(k - 1);
        }

    }
}

