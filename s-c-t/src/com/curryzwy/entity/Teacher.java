package com.curryzwy.entity;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:21
 */
public class Teacher {
    private int tId ; //老师id
    private String tName ; //老师姓名
    private String userName ; //用户名
    private String pwd ; //密码

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
