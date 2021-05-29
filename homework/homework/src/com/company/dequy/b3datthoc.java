package com.company.dequy;

import java.util.Scanner;

public class b3datthoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So o can dat thoc: ");
        int n = sc.nextInt();
        int x = datthoc(n);
        System.out.println("So thoc: " + x);

    }

    public static int datthoc(int n) {
        if (n == 1) {
            return 1;
        }
        return (2 * datthoc(n - 1));
    }
}
