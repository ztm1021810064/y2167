package cn.service;

import cn.entity.Talks;

import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public interface TalksService {
    public List<Talks> list(Integer nid);

    public int insert(String content,String talkTime,Integer nid);
}
