package com.curryzwy.entity;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:26
 */
public class Sc {
    private int scId ; //学生成绩id
    private int stuId ; //学生id
    private int cId ; //课程id
    private Double score ; //成绩

    public int getScId() {
        return scId;
    }

    public void setScId(int scId) {
        this.scId = scId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
