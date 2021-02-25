package com.curryzwy.dao;

import com.curryzwy.entity.Sc;
import com.curryzwy.entity.Student;
import com.curryzwy.utils.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:30
 */
public class StudentDao {
    public void add(Student student) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into student(stuName,stuNo,stuPwd) values(?,?,?)";
        queryRunner.update(sql,student.getStuName(),student.getStuNo(),student.getStuPwd());
    }

    public void delete(int stuId) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from student where  stuId = ?";
        queryRunner.update(sql,stuId);
    }

    public void update(Student student) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update student set stuName = ?,stuPwd = ? where stuId = ?";
        queryRunner.update(sql,student.getStuName(),student.getStuPwd(),student.getStuId());
    }

    public List<Student> list(Student student) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from student";
        List<Student> list = (List<Student>) queryRunner.query(sql,new BeanHandler<>(Student.class));
        return list;
    }

    public Student findById(int stuId) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from student where stuId = ?";
        Student student = queryRunner.query(sql,new BeanHandler<>(Student.class),stuId);
        return student;
    }
}
