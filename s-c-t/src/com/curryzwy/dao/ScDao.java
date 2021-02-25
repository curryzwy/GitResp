package com.curryzwy.dao;

import com.curryzwy.entity.Course;
import com.curryzwy.entity.Sc;
import com.curryzwy.utils.PropertiesUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Auther:curryzwy
 * @Date:2021-02-25-12:31
 */
public class ScDao {
    public void add(Sc sc) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "insert into sc(stuId,cId,score) values(?,?,?)";
        queryRunner.update(sql,sc.getStuId(),sc.getcId(),sc.getScore());
    }

    public void delete(int scId) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "delete from sc where  scId = ?";
        queryRunner.update(sql,scId);
    }

    public void update(Sc sc) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "update sc set score = ? where scId = ?";
        queryRunner.update(sql,sc.getScore(),sc.getScId(),sc.getScId());
    }

    public List<Sc> list(Sc sc) throws SQLException{
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from sc";
        List<Sc> list = (List<Sc>) queryRunner.query(sql,new BeanHandler<>(Sc.class));
        return list;
    }

    public Sc findById(int scId) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(PropertiesUtils.getDataSource());
        String sql = "select * from sc where scId = ?";
        Sc sc = queryRunner.query(sql,new BeanHandler<>(Sc.class),scId);
        return sc;
    }
}
