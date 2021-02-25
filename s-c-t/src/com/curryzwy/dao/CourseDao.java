package com.curryzwy.dao;

import com.curryzwy.entity.Admin;
import com.curryzwy.entity.Course;
import com.curryzwy.utils.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:31
 */
public class CourseDao {
    public void add(Course course) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into course(cName,tId) values(?,?)";
        queryRunner.update(sql,course.getcName(),course.gettId());
    }

    public void delete(int cid) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from course where  cid = ?";
        queryRunner.update(sql,cid);
    }

    public void update(Course course) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update course set tName = ?,tId = ? where cid = ?";
        queryRunner.update(sql,course.getcName(),course.gettId(),course.getcId());
    }

    public List<Course> list(Course course) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from course";
        List<Course> list = (List<Course>) queryRunner.query(sql,new BeanHandler<>(Course.class));
        return list;
    }

    public Course findById(int cId) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from course where cId = ?";
        Course course = queryRunner.query(sql,new BeanHandler<>(Course.class),cId);
        return course;
    }
}
