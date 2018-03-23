import cn.happy.dao.*;
import cn.happy.entity.*;
import cn.happy.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-01-29.
 */
public class Test20180226 {

    //06.自关联
    @Test
    public  void  selfSelect(){
        SqlSession session = MyBatisUtils.getSession();
        ICategoryDAO mapper = session.getMapper(ICategoryDAO.class);
        List<Category> list = mapper.getChildrenByPid(1);
        for (Category cate:list) {
            System.out.println(cate);
        }
        //6.关闭session
        session.close();
    }

    //05.多对多关联查询
    @Test
    public  void  manyToMany(){
        SqlSession session = MyBatisUtils.getSession();
        ITeacherDAO mapper = session.getMapper(ITeacherDAO.class);
        Teacher teacher = mapper.findAllStudentsByTeacherId(1);
        System.out.println(teacher.getTname());
        for (Student stu:teacher.getStus()) {
            System.out.println(stu.getSname());
        }
        //6.关闭session
        session.close();
    }

    //04.多对一单向关联 多条SQL方案
    @Test
    public  void  manyToOneMulti(){
        SqlSession session = MyBatisUtils.getSession();
        IEmpDAO mapper = session.getMapper(IEmpDAO.class);
        Emp emp = mapper.getDeptByEmpNoMulti(1);
        System.out.println("雇员名称"+emp.getEmpName());
        System.out.println("所属部门"+emp.getDept().getDeptName());
        //6.关闭session
        session.close();
    }

    //03.多对一单向关联 单条SQL方案
    @Test
    public  void  manyToOneSingle(){
        SqlSession session = MyBatisUtils.getSession();
        IEmpDAO mapper = session.getMapper(IEmpDAO.class);
        Emp emp = mapper.getDeptByEmpNo(1);
        System.out.println("雇员名称"+emp.getEmpName());
        System.out.println("所属部门"+emp.getDept().getDeptName());
        //6.关闭session
        session.close();
    }

    //02.一对多单向关联 多条SQL方案
    @Test
    public  void  oneToManySingleSQLMulti(){
        SqlSession session = MyBatisUtils.getSession();
        IDeptDAO mapper = session.getMapper(IDeptDAO.class);
        Dept dept = mapper.getEmpsByDeptNoMultiSQL(1);
        System.out.println(dept.getDeptName());
        System.out.println(dept.getEmps().size());
        for (Emp emp:dept.getEmps()) {
            System.out.println(emp.getEmpName());
        }
        //6.关闭session
        session.close();
    }

    //01.一对多单向关联 单条SQL方案
    @Test
    public  void  oneToManySingleSQL(){
        SqlSession session = MyBatisUtils.getSession();
        IDeptDAO mapper = session.getMapper(IDeptDAO.class);
        Dept dept = mapper.getEmpsByDeptNo(1);
        System.out.println(dept.getDeptName());
        System.out.println(dept.getEmps().size());
        for (Emp emp:dept.getEmps()) {
            System.out.println(emp.getEmpName());
        }
        //6.关闭session
        session.close();
    }


}
