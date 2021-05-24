package com.company.buoi2;

import java.util.Scanner;

public class btstring {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap xau");
        String str = sc.nextLine();
        int a[] = new int[256];
        for (
                int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= 256; j++) {
                if (str.charAt(i) == j) {
                    a[j] += 1;
                }
            }
        }
        for (
                int i = 1;
                i <= 256; i++) {
            if (a[i] != 0) {
                System.out.println((char) i + ":" + a[i]);
            }
        }

        System.out.println("nhap xau");
        int count = 0;
        String st = sc.nextLine();

        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) == st.charAt(st.length() - i - 1)) {
                count += 1;
            } else {
                System.out.println("khong là xâu Palindrome");
                return;
            }
            if (count == st.length() / 2) {
                System.out.println("la xau Palindrome");
            }
        }
    }
}
