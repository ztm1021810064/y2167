package cn.service.impl;

import cn.dao.UserDao;
import cn.entity.User;
import cn.service.UserService;
import cn.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by MESGOD纯贱 on 2018/2/27.
 */
public class UserServiceImpl implements UserService {
    public int login(String userName,String userPassword) {
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        int result = mapper.login(userName,userPassword);
        return result;
    }

    public User user(String userName) {
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        User user = mapper.user(userName);
        return  user;
    }

    public User oldPassword(Integer userCode) {
        SqlSession session = MyBatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        User user = mapper.oldPassword(userCode);
        return  user;
    }
}
