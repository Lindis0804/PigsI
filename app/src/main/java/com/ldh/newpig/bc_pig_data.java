package com.ldh.newpig;

public class bc_pig_data {
    String ngayhoadon;
    int tongTL,tongXC,tongchet;

    public bc_pig_data(String ngayhoadon, int tongTL, int tongXC, int tongchet) {
        this.ngayhoadon = ngayhoadon;
        this.tongTL = tongTL;
        this.tongXC = tongXC;
        this.tongchet = tongchet;
    }

    public String getNgayhoadon() {
        return ngayhoadon;
    }

    public void setNgayhoadon(String ngayhoadon) {
        this.ngayhoadon = ngayhoadon;
    }

    public int getTongTL() {
        return tongTL;
    }

    public void setTongTL(int tongTL) {
        this.tongTL = tongTL;
    }

    public int getTongXC() {
        return tongXC;
    }

    public void setTongXC(int tongXC) {
        this.tongXC = tongXC;
    }

    public int getTongchet() {
        return tongchet;
    }

    public void setTongchet(int tongchet) {
        this.tongchet = tongchet;
    }
}
