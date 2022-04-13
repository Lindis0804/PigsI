package com.ldh.newpig;

public class bc_qldh_data_item {
    String maSo,ngayNX,nhapXuat,giong;

    public bc_qldh_data_item(String maSo, String ngayNX, String nhapXuat, String giong) {
        this.maSo = maSo;
        this.ngayNX = ngayNX;
        this.nhapXuat = nhapXuat;
        this.giong = giong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getNgayNX() {
        return ngayNX;
    }

    public void setNgayNX(String ngayNX) {
        this.ngayNX = ngayNX;
    }

    public String getNhapXuat() {
        return nhapXuat;
    }

    public void setNhapXuat(String nhapXuat) {
        this.nhapXuat = nhapXuat;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }
}
