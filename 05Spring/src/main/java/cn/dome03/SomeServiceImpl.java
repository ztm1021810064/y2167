package cn.dome03;

import cn.dome02.*;

/**
 * Created by MESGOD纯贱 on 2018/3/12.
 */
public class SomeServiceImpl implements cn.dome03.SomeService {
    public void insert() {
        System.out.println("insert");
    }

    public void update() {
        System.out.println("update");
    }

    public void delete() {
        int result=5/0;
        System.out.println("delete");
    }

    public void select() {
        System.out.println("select");
    }
}
