package cn.service.impl;

import cn.dao.NewsDao;
import cn.entity.News;
import cn.entity.Page;
import cn.service.NewsService;
import cn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public class NewsServiceImpl implements NewsService {
    public List<News> findByPage(Page page) throws SQLException {
        SqlSession session = MyBatisUtil.SqlSession();
        NewsDao mapper = session.getMapper(NewsDao.class);
        List<News> list = mapper.findByPage(page);
        return list;
    }

    public int getCount() throws SQLException {
        SqlSession session = MyBatisUtil.SqlSession();
        NewsDao mapper = session.getMapper(NewsDao.class);
        int result = mapper.getCount();
        return result;
    }

    public int update(Integer newId) throws SQLException {
        SqlSession session = MyBatisUtil.SqlSession();
        NewsDao mapper = session.getMapper(NewsDao.class);
        int count = mapper.update(newId);
        return count;
    }

    public News news(Integer newId) {
        SqlSession session = MyBatisUtil.SqlSession();
        NewsDao mapper = session.getMapper(NewsDao.class);
        News news = mapper.news(newId);
        return news;
    }

}
