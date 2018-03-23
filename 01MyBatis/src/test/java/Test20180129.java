import cn.happy.entity.Book;
import cn.happy.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Happy on 2018-01-29.
 */
public class Test20180129 {

   //05.根据主键查询单个图书对象
    @Test
    public  void  t5selectOneBook(){
        //1.
        String path="Mybatis-Config.xml";

        //2.输入流
        try {
            InputStream is= Resources.getResourceAsStream(path);
            //3. 创建SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);

            //4.创建SqlSession
            SqlSession session = factory.openSession();

            Book book = session.selectOne("findOneBookByPrimaryKey", 1);
            System.out.println(book.getBookName());

            //6.关闭session
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4.修改
    @Test
    public  void  t4update(){
        //1.
        String path="Mybatis-Config.xml";
        //2.输入流
        try {
            InputStream is= Resources.getResourceAsStream(path);
            //3. 创建SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //4.创建SqlSession
            SqlSession session = factory.openSession();

            Book book=new Book();
            book.setBookID(3);
            book.setBookName("不凡的世界");

            int count = session.update("updateBook", book);
            System.out.println(count);
            session.commit();
            System.out.println("update ok!");
            //6.关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    //3.删除图书
    @Test
    public  void  t3del(){
        //1.
        String path="Mybatis-Config.xml";
        //2.输入流
        try {
            InputStream is= Resources.getResourceAsStream(path);
            //3. 创建SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //4.创建SqlSession  dirty：false
            SqlSession session = factory.openSession();
            //执行
            int count = session.delete("delBook", 4);
            session.commit();
            if (count>0){
                System.out.println("del ok!");
            }else {
                //sout tab
                System.out.println("del failed");
            }
            //6.关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    //添加图书
    @Test
    public  void  t2Insert(){

            SqlSession session = MyBatisUtils.getSession();
            Book book=new Book();
            book.setBookName("未来已来");
            book.setBookAuthor("马云");
            book.setBookPrice(100);

            //执行
            int count = session.insert("addBook", book);
            //session 连接对象 Java程序和DB之前的交互入口
            session.commit();
            if (count>0){
                System.out.println("add ok!");
            }else {
                //sout tab
                System.out.println("add failed");
            }

            //6.关闭session
            session.close();



    }


   @Test
   public  void  t1(){
      /* Logger logger=Logger.getLogger("xxxxx");*/
        //1.
       String path="Mybatis-Config.xml";

       //2.输入流
       try {
           InputStream is= Resources.getResourceAsStream(path);
           //3. 创建SqlSessionFactory
           SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
           //4.创建SqlSession
           SqlSession session = factory.openSession();
           List<Book> list = session.selectList("findAllBooks");
           for (Book book:list) {
               System.out.println(book.getBookName());
           }

           //Logger对象的生成
          /* logger.debug("我是debug");
           logger.info("我是INfo");
*/
           //6.关闭session
           session.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
