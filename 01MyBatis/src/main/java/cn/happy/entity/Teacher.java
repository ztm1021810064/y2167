package cn.happy.entity;/**
 * Created by Happy on 2018-02-26.
 */

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-02-26
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Teacher {
    private Integer tid;
    private String tname;
    private List<Student> stus;

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
