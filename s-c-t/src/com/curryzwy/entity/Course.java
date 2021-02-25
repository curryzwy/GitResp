package com.curryzwy.entity;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:24
 */
public class Course {
    private int cId ; //课程id
    private String cName ; //课程名
    private int tId ; //老师id

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }
}
