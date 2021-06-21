package com.company;

public class Student {
    int MSSV;
    String hovaten;
    private String matkhau;

    Student() {
        System.out.println("ham khoi tao voi: ");
    }

    Student(int MSSV){
        System.out.println("ham khoi tao voi int MSSV ");
    }
Student(String hovaten){
    System.out.println("ham khoi tao voi String hovaten : ");
}
    int getMSSV() {
        return this.MSSV;
    }

    void setMSSV(int x) {
        System.out.println("ham set mssv su dung input la int");
        this.MSSV = x;
    }

    void setMSSV(String x) {
        System.out.println();
        this.MSSV = Integer.parseInt(x);
    }


    void setMatkhau(String newMatkhau) {
        this.matkhau = newMatkhau;
    }
}
