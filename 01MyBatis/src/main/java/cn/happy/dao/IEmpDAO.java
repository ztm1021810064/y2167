package cn.happy.dao;

import cn.happy.entity.Dept;
import cn.happy.entity.Emp;

/**
 * Created by Happy on 2018-02-26.
 */
public interface IEmpDAO {
    //指定员工编号 同时检索部门信息
    public Emp getDeptByEmpNo(int empNo);
    //指定员工编号 同时检索部门信息
    public Emp getDeptByEmpNoMulti(int empNo);

}
