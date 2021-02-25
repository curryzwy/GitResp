package com.curryzwy.dao;

import com.curryzwy.entity.Admin;
import com.curryzwy.utils.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 *使用DBUtils工具类
 */

import java.util.List;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:30
 */
public class AdminDao {
    public void add(Admin admin) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into admin(userName,pwd,name) values(?,?,?)";
        queryRunner.update(sql,admin.getUserName(),admin.getPwd(),admin.getName());
    }

    public void delete(int id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from admin where  id = ?";
        queryRunner.update(sql,id);
    }

    public void update(Admin admin) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update admin set userName = ?,pwd = ?,name = ? where id = ?";
        queryRunner.update(sql,admin.getUserName(),admin.getPwd(),admin.getName(),admin.getId());
    }

    public List<Admin> list(Admin admin) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from admin";
        List<Admin> list = (List<Admin>) queryRunner.query(sql,new BeanHandler<>(Admin.class));
        return list;
    }

    public Admin findById(int id) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from admin where id = ?";
        Admin admin = queryRunner.query(sql,new BeanHandler<>(Admin.class));
        return admin;
    }
}
