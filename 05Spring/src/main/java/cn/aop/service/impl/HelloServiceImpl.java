package cn.aop.service.impl;

import cn.aop.dao.HelloDao;
import cn.aop.service.HelloService;

/**
 * Created by MESGOD纯贱 on 2018/3/5.
 */
public class HelloServiceImpl implements HelloService {
    HelloDao dao;
    public void doSome() {
        dao.doSome();
    }

    public HelloDao getDao() {
        return dao;
    }

    public void setDao(HelloDao dao) {
        this.dao = dao;
    }
}
