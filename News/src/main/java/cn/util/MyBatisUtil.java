package cn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public class MyBatisUtil {
    static String path="MyBatis-Config.xml";
    static InputStream is;
    static SqlSessionFactory factory;
    static{
        try {
            is= Resources.getResourceAsStream(path);
            factory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession SqlSession(){
        return factory.openSession(true);
    }
}
