import cn.dao.UserDao;
import cn.entity.User;
import cn.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by MESGOD纯贱 on 2018/2/27.
 */
public class test {

    @Test
    public void login(){
        SqlSession session = MyBatisUtils.getSession();
        UserDao dao = session.getMapper(UserDao.class);
        int result = dao.login("ztm","111");
        System.out.println(result);
    }
}
