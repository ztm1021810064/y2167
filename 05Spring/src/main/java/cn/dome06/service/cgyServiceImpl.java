package cn.dome06.service;

import cn.dome06.dao.IAccountDao;
import cn.dome06.dao.IStockDao;
import cn.dome06.enetity.cgyException;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by MESGOD纯贱 on 2018/3/15.
 */
public class cgyServiceImpl implements cgyService {

    private IAccountDao aDao;

    private IStockDao sDao;

//    @Transactional(rollbackFor = cgyException.class)
    public void cgy(int aid, int aBalance, int sid, int sCount) throws cgyException {
        boolean isBuy = true;
        aDao.updateAccount(aid,aBalance,isBuy);
        if(1==1) {
            throw new cgyException("购买失败");
        }
        sDao.buyStock(sid,sCount,isBuy);

    }

    public IAccountDao getaDao() {
        return aDao;
    }

    public void setaDao(IAccountDao aDao) {
        this.aDao = aDao;
    }

    public IStockDao getsDao() {
        return sDao;
    }

    public void setsDao(IStockDao sDao) {
        this.sDao = sDao;
    }
}
