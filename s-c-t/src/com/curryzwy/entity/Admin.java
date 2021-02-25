package com.curryzwy.entity;


/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:19
 */
public class Admin {
    private int id ; //管理员id
    private String userName ; //用户名
    private String pwd ; //密码
    private String name ; //管理员姓名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
