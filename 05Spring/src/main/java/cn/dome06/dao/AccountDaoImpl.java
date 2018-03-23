package cn.dome06.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by MESGOD纯贱 on 2018/3/15.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public void updateAccount(int aid, int aBalance, boolean isBuy) {
        String sql=null;
        if (isBuy){
            sql="UPDATE account SET aBalance = aBalance - ? WHERE aid=?";
        }else{
            sql="UPDATE account SET aBalance = aBalance + ? WHERE aid=?";
        }
        int update=this.getJdbcTemplate().update(sql,aBalance,aid);
    }
}
