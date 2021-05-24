package com.company.thuattoancoban;

import java.util.Scanner;

public class b6giophutgiay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gio = sc.nextInt();
        int phut = sc.nextInt();
        int giay = sc.nextInt();
        System.out.println(gio + ":" + phut + ":" + giay);

        //giay += 1;
        int tongsogiay = gio * 3600 + phut * 60 + giay;

        tongsogiay += 1;
        gio = (tongsogiay / 3600) % 24;
        phut = (tongsogiay / 60) % 60;
        giay = tongsogiay % 60;

        System.out.println("cong 1s: " + gio + ":" + phut + ":" + giay);
    }
}
