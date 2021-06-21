package com.company.package_a;

public class A2 extends A {
    int x2;

    A2() {
        System.out.println("Constructor A ");
    }

    public A2(int x) {
        super();
        System.out.println("Constructor 1 A");
    }

    public A2(int x1, int x2) {
        super(x1);
        System.out.println("Constructor 2 A");
    }

    @Override
    public void phuongthucPublic() {
        super.phuongthucPublic();
        System.out.println("phuongthuc A2");
    }
}
