import cn.happy.dao.IBookDAO;
import cn.happy.entity.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Happy on 2018-01-29.
 */
public class Test20180222 {

    //02.根据图书名称模糊查询
    @Test
    public  void  likeSelect(){
        //1.指定大配置路径
        String path="Mybatis-Config.xml";
        //2.输入流
        try {
            //将字符串路径对应的文件转换成输入流
            InputStream is= Resources.getResourceAsStream(path);
            //3. 创建SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //4.创建SqlSession
            SqlSession session = factory.openSession();
            //名字不匹配，浪费开发时间，节省时间
            IBookDAO mapper = session.getMapper(IBookDAO.class);
            List<Book> list = mapper.likeSelect("四");
            for (Book item:list) {
                System.out.println(item.getBookName());
            }
            //6.关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   //01.根据主键查询单个图书对象
    @Test
    public  void  t5selectOneBook(){
        //1.指定大配置路径
        String path="Mybatis-Config.xml";
        //2.输入流
        try {
            //将字符串路径对应的文件转换成输入流
            InputStream is= Resources.getResourceAsStream(path);
            //3. 创建SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //4.创建SqlSession
            SqlSession session = factory.openSession();
            //名字不匹配，浪费开发时间，节省时间
            IBookDAO mapper = session.getMapper(IBookDAO.class);
            Book book = mapper.findOneBookByPrimaryKey(1);
            System.out.println(book.getBookName());
            //6.关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
