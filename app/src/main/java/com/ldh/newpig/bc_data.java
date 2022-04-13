package com.ldh.newpig;

public class bc_data {
    String ngay_hoa_don,ten_chi_phi;
    int tong_tien;

    public bc_data(String ngay_hoa_don, String ten_chi_phi, int tong_tien) {
        this.ngay_hoa_don = ngay_hoa_don;
        this.ten_chi_phi = ten_chi_phi;
        this.tong_tien = tong_tien;
    }

    public String getNgay_hoa_don() {
        return ngay_hoa_don;
    }

    public void setNgay_hoa_don(String ngay_hoa_don) {
        this.ngay_hoa_don = ngay_hoa_don;
    }

    public String getTen_chi_phi() {
        return ten_chi_phi;
    }

    public void setTen_chi_phi(String ten_chi_phi) {
        this.ten_chi_phi = ten_chi_phi;
    }

    public int getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }
}
