package cn.service.impl;

import cn.dao.TalksDao;
import cn.entity.Talks;
import cn.service.TalksService;
import cn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public class TalksServiceImpl implements TalksService{
    public List<Talks> list(Integer nid) {
        SqlSession session = MyBatisUtil.SqlSession();
        TalksDao mapper = session.getMapper(TalksDao.class);
        List<Talks> list =mapper.list(nid);
        return list;
    }

    public int insert(String content,String talkTime,Integer nid) {
        SqlSession session = MyBatisUtil.SqlSession();
        TalksDao mapper = session.getMapper(TalksDao.class);
        int result = mapper.insert(content,talkTime,nid);
        return result;
    }
}
