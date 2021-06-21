package com.company.buoi6_oop;

public class SinhVien {

    int MSSV;
    String name;
    int diemToan;
    int diemLy;
    int diemHoa;

    public SinhVien(int MSSV, String name) {
        this.MSSV = MSSV;
        this.name = name;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double trungBinh(){
        double trungBinh = (double)(this.diemHoa+this.diemLy+this.diemToan)/3;
        return trungBinh;
    }
    public boolean check(){
        return (this.diemHoa+this.diemLy+this.diemToan)>10?true:false;
    }
    public void addToan(double x){
        this.diemToan += x;
    }
    public double roundUp(double x){
        if(x<0) return 0;
        if(x>10) return 10;
        return x;
    }
}
