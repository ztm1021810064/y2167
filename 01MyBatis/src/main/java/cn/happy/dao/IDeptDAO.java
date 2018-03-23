package cn.happy.dao;

import cn.happy.entity.Dept;
import cn.happy.entity.Emp;

import java.util.List;

/**
 * Created by Happy on 2018-02-26.
 */
public interface IDeptDAO {
    //指定部门编号下所有的员工集合  部门   员工的姓名
    public Dept getEmpsByDeptNo(int deptNo);
    //指定部门编号下所有的员工集合  部门   员工的姓名
    public Dept getEmpsByDeptNoMultiSQL(int deptNo);
}
