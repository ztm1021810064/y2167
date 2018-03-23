package cn.dome06.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by MESGOD纯贱 on 2018/3/15.
 */
public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    public void buyStock(int sid, int sCount, boolean isBuy) {
        String sql=null;
        if (isBuy){
            sql="UPDATE stock SET sCount=sCount+? WHERE sid=?";
        }else{
            sql="UPDATE stock SET sCount=sCount-? WHERE sid=?";
        }
        int update = this.getJdbcTemplate().update(sql,sCount,sid);
    }
}
