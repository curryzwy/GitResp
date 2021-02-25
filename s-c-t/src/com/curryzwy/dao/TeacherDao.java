package com.curryzwy.dao;

import com.curryzwy.entity.Student;
import com.curryzwy.entity.Teacher;
import com.curryzwy.utils.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:31
 */
public class TeacherDao {
    public void add(Teacher teacher) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into teacher(tName,userName,pwd) values(?,?,?)";
        queryRunner.update(sql,teacher.gettName(),teacher.getUserName(),teacher.getPwd());
    }

    public void delete(int tId) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from teacher where  tId = ?";
        queryRunner.update(sql,tId);
    }

    public void update(Teacher teacher) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update teacher set tName = ?,pwd = ? where tId = ?";
        queryRunner.update(sql,teacher.gettName(),teacher.getPwd(),teacher.gettId());
    }

    public List<Teacher> list(Teacher teacher) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from teacher";
        List<Teacher> list = (List<Teacher>) queryRunner.query(sql,new BeanHandler<>(Teacher.class));
        return list;
    }

    public Teacher findById(int tId) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from teacher where tId = ?";
        Teacher teacher = queryRunner.query(sql,new BeanHandler<>(Teacher.class),tId);
        return teacher;
    }
}
