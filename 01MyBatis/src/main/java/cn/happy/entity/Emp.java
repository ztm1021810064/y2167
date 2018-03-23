package cn.happy.entity;/**
 * Created by Happy on 2018-02-25.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-02-25
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Emp {
    private  Integer empNo; //员工编号
    private String empName; //员工姓名
    private Integer deptNo; //所属部门编号

    //植入部门对象
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}
