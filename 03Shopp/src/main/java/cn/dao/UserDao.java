package cn.dao;

import cn.entity.User;

/**
 * Created by MESGOD纯贱 on 2018/2/25.
 */
public interface UserDao {
    public int login(String userName,String userPassword);
    public User user(String userName);
    public User oldPassword(Integer userCode);
}
