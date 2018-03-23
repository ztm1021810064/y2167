package cn.happy.dao;/**
 * Created by Happy on 2018-02-26.
 */

import cn.happy.entity.Teacher;

/**
 * 作者：微冷的雨
 *
 * @create 2018-02-26
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public interface ITeacherDAO {
    public Teacher findAllStudentsByTeacherId(int tid);
}
