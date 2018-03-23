import cn.happy.dao.IBookDAO;
import cn.happy.entity.Book;
import cn.happy.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-01-29.
 */
public class Test20180224 {

    //07.智能标签foreach list Book
    @Test
    public  void  selectForeachListBook(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        List<Book> listBooks=new ArrayList<Book>();
        Book book=new Book();
        book.setBookID(3);

        Book b2=new Book();
        b2.setBookID(11);

        listBooks.add(book);
        listBooks.add(b2);
        List<Book> list = mapper.findByForEachListBook(listBooks);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }

    //06.智能标签foreach list
    @Test
    public  void  selectForeachList(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        List<Integer> listIds=new ArrayList<Integer>();
        listIds.add(3);
        listIds.add(11);
        List<Book> list = mapper.findByForEachList(listIds);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }


    //05.智能标签foreach array
    @Test
    public  void  selectForeachArray(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        int[] bookids={3,11,12};
        List<Book> list = mapper.findByForEachArray(bookids);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }

    //04.智能标签choose
    @Test
    public  void  selectChoose(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        Book book=new Book();
        book.setBookName("四");
        List<Book> list = mapper.findByChoose(book);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }

    //04.智能标签if
    @Test
    public  void  selectIf(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        Book book=new Book();
        book.setBookName("四");
        book.setBookPrice(30);
        List<Book> list = mapper.findByIf(book);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }

    //03.多条件查询按照索引号
    @Test
    public  void  selectMultiConditionIndex(){
        SqlSession session = MyBatisUtils.getSession();
        IBookDAO mapper = session.getMapper(IBookDAO.class);
        List<Book> list = mapper.selectMultiConditionIndex("四",30);
        for (Book item:list) {
            System.out.println(item.getBookName());
        }
        //6.关闭session
        session.close();
    }

    //02.多条件查询封装成Map集合
    @Test
    public  void  selectMultiConditionMap(){
            SqlSession session = MyBatisUtils.getSession();
            IBookDAO mapper = session.getMapper(IBookDAO.class);
            Map<String,Object> map=new HashMap<String,Object>();
           //规则：这里put进去的key值必须和实体的属性完全对应
            map.put("bookName","四");
            map.put("bookPrice",30);
            List<Book> list = mapper.selectMultiConditionMap(map);
            for (Book item:list) {
                System.out.println(item.getBookName());
            }
            //6.关闭session
            session.close();
    }

   //01.获取新添加记录的id值
    @Test
    public  void  t1getInsertId(){
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
            Book book=new Book();
            //没有给图书编号
            book.setBookName("未来已来2");
            book.setBookAuthor("马云2");
            book.setBookPrice(100);
            System.out.println(book.getBookID()+"===================");
            mapper.insertBook(book);
            session.commit();
            System.out.println(book.getBookID());
            //6.关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
