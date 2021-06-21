package com.company.package_a;

public class A {

    int thuocTinhDefault;
    public int thuoctinhPublic;
    private int thuoctinhPrivate;
    protected int thuoctinhProtected;

    public A() {
        System.out.println("Constructor 1 A");
    }

    public A(int x) {
        System.out.println("Constructor 2 A");
    }

    void phuongThucDefault() {
        System.out.println("phuongTHucDefault");
    }

    public void phuongthucPublic() {
        System.out.println("phuongthucPublic");
    }

    private void phuongthucPrivate() {
        System.out.println("phuongthucPrivate");
    }

    protected void phuongthucProtected() {
        System.out.println("phuongthucProtected");
    }
}

