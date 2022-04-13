package com.ldh.newpig;

public class ThongTinSLSP {
    String tenSP;
    int sqlp;
    boolean isSelected;

    public ThongTinSLSP(String tenSP, int sqlp, boolean isSelected) {
        this.tenSP = tenSP;
        this.sqlp = sqlp;
        this.isSelected = isSelected;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSqlp() {
        return sqlp;
    }

    public void setSqlp(int sqlp) {
        this.sqlp = sqlp;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
