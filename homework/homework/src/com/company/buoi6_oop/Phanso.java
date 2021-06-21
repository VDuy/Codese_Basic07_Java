package com.company.buoi6_oop;

public class Phanso {
    private int tu, mau;

    public Phanso() {
        tu = 0;
        mau = 0;
    }

    public Phanso(int n) {
        tu = n;
        mau = 1;
    }

    public Phanso(int t, int m) {
        tu = t;
        mau = m;
    }

    public Phanso(Phanso phanso) {
        tu = phanso.tu;
        mau = phanso.mau;
    }

    public int getMau() {
        return mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        if (mau > 0)
            this.mau = mau;
    }

    public Phanso rutgon() {
        int t = Math.abs(tu);
        int m = Math.abs(mau);

        int min = Math.min(t, m);
        int i, k = 1;
        for (i = 2; i <= min; i++) {
            if ((t % i == 0) && (m % i == 0))
                k = i;
        }

        tu = tu / k;
        mau = mau / k;
        Phanso phanso = new Phanso(tu, mau);
        return phanso;
    }

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }

    public void hienThi(String s) {
        System.out.println(s);
    }

    public double giaTri() {
        return (double) tu / mau;
    }


    public Phanso tang(int n) {
        this.tu = this.tu + this.mau * n;
        return this.rutgon();
    }

    public void gap(int n) {
        this.tu = n * this.tu;
    }

    public Phanso cong(int n) {
        Phanso p1 = new Phanso();
        p1.tu = this.tu + this.mau * n;
        p1.mau = this.mau;
        return p1.rutgon();
    }


    public Phanso tru(int n) {
        Phanso p1 = new Phanso();
        p1.tu = this.tu - this.mau * n;
        p1.mau = this.mau;
        return p1.rutgon();
    }

    public Phanso cong(Phanso p) {
        Phanso result = new Phanso();
        result.tu = this.tu * p.mau + p.tu * this.mau;
        result.mau = this.mau * p.mau;
        return result.rutgon();
    }

    public Phanso tru(Phanso p) {
        Phanso result = new Phanso();
        result.tu = this.tu * p.mau - p.tu * this.mau;
        result.mau = this.mau * p.mau;
        return result.rutgon();
    }

    public Phanso nhan(Phanso p) {
        Phanso result = new Phanso();
        result.tu = this.tu * p.tu;
        result.mau = this.mau * p.mau;
        return result.rutgon();
    }

    public Phanso nhan(int n) {
        Phanso result = new Phanso();
        result.tu = this.tu * n;
        result.mau = this.mau;
        return result.rutgon();
    }

    public Phanso chia(Phanso p) {
        Phanso result = new Phanso();
        result.tu = this.tu * p.mau;
        result.mau = this.mau * p.tu;
        return result.rutgon();
    }

    public Phanso chia(int n) {
        Phanso result = new Phanso();
        result.tu = this.tu;
        result.mau = this.mau * n;
        return result.rutgon();
    }

    public String toString() {

        String s = tu + "/" + mau;

        return s;
    }

    int soSanh(Phanso p) {
        Phanso kq = this.tru(p);
        long l = kq.tu * kq.mau;

        if (l == 0)
            return 0;
        else if (l < 0)
            return -1;
        else
            return 1;
    }
}


