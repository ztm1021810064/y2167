package cn.happy.util;/**
 * Created by Happy on 2018-02-24.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * 作者：微冷的雨
 * @create 2018-02-24
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyBatisUtils {
    //对外提供一个获取Session的渠道
        static String path="Mybatis-Config.xml";
        static InputStream is;
        //一般情况下我们认为 ，SqlSessionFactory重量级对象，构建该对象，非常消耗性能。一个软件系统
    //中有一个工厂即可。
        static   SqlSessionFactory factory;
        static {
            try {
                is = Resources.getResourceAsStream(path);
                factory=new SqlSessionFactoryBuilder().build(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       //3. 创建SqlSessionFactory
        public static SqlSession getSession(){
                //4.创建SqlSession
                return  factory.openSession();
        }
}
