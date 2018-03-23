package cn.happy.entity;/**
 * Created by Happy on 2018-02-26.
 */

import java.util.List;
import java.util.Set;

/**
 * 作者：微冷的雨
 *
 * @create 2018-02-26
 * 博客地址:www.cnblogs.com/weilengdeyu
 *
 * 既可以充当一的一方 ，又可以多的一方
 */
public class Category {
    private Integer cid;
    private String cname;
    private Set<Category> cates;

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cates=" + cates +
                '}';
    }

    public Set<Category> getCates() {
        return cates;
    }

    public void setCates(Set<Category> cates) {
        this.cates = cates;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
