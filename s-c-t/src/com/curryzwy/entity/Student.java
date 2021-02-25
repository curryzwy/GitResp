package com.curryzwy.entity;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:08
 */
public class Student {
    private int stuId; //学生id
    private String stuName ; //学生姓名
    private String stuNo ; //学生学号
    private String stuPwd ; //密码

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }
}
