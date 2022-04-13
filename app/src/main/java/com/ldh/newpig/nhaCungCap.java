package com.ldh.newpig;

public class nhaCungCap {
    private int image;
    private String tenCongTy;
    private String soSanPham;

    public nhaCungCap(int image, String tenCongTy, String soSanPham) {
        this.image = image;
        this.tenCongTy = tenCongTy;
        this.soSanPham = soSanPham;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(String soSanPham) {
        this.soSanPham = soSanPham;
    }
}
