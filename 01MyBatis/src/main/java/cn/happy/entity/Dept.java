package cn.happy.entity;/**
 * Created by Happy on 2018-02-25.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-02-25
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Dept {
    private  Integer deptNo;//部门的编号
    private String deptName; //名称

    private List<Emp> emps=new ArrayList<Emp>();

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
