package com.qls.test;

/**
 * Created by qinlinsen on 2017/4/17.
 */
public class Office {
    private  Integer officeNo;

    public Integer getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(Integer officeNo) {
        this.officeNo = officeNo;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeNo=" + officeNo +
                '}';
    }
}

