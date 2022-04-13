package com.ldh.newpig;

public class bc_bcdt_data_item {
    String thoiGian;
    int chiPhi,doanhThu,loiNhuan;

    public bc_bcdt_data_item(String thoiGian, int chiPhi, int doanhThu, int loiNhuan) {
        this.thoiGian = thoiGian;
        this.chiPhi = chiPhi;
        this.doanhThu = doanhThu;
        this.loiNhuan = loiNhuan;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(int loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
}
