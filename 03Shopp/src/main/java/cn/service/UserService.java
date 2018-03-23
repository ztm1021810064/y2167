package cn.service;

import cn.entity.User;

/**
 * Created by MESGOD纯贱 on 2018/2/27.
 */
public interface UserService {
    public int login(String userName,String userPassword);
    public User user(String userName);
    public User oldPassword(Integer userCode);
}
