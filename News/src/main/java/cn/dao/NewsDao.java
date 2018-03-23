package cn.dao;

import cn.entity.News;
import cn.entity.Page;
import cn.entity.Talks;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public interface NewsDao {
    public List<News> findByPage(Page page) throws SQLException;

    public int getCount() throws SQLException;

    public int update(Integer newId) throws SQLException;

    public News news(Integer newId);
}
