package cn.dome06.service;

import cn.dome06.enetity.cgyException;

/**
 * Created by MESGOD纯贱 on 2018/3/15.
 */
public interface cgyService {
    public void cgy(int aid,int aBalance,int sid,int sCount) throws cgyException;
}
