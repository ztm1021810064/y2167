package cn.happy.dao;

import cn.happy.entity.Category;

import java.util.List;

/**
 * Created by Happy on 2018-02-26.
 */
public interface ICategoryDAO {
    public List<Category> getChildrenByPid(int pid);
}
