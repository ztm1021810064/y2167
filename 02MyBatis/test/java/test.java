import cn.dao.BookDAO;
import cn.entity.Book;
import cn.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MESGOD纯贱 on 2018/1/29.
 */
public class test {

    @Test
    public void selectBook(){
        SqlSession session = MyBatisUtils.getSession();
        BookDAO mapper = session.getMapper(BookDAO.class);
        Book book = mapper.selectBook(1);
        System.out.println(book.getBookName());

        System.out.println("===============================================");

        SqlSession session1 = MyBatisUtils.getSession();
        BookDAO mapper1 = session1.getMapper(BookDAO.class);
        Book book1 = mapper1.selectBook(1);
        System.out.println(book1.getBookName());
    }
    @Test
    public void selectMultiConditionIndex(){
        SqlSession session = MyBatisUtils.getSession();
        BookDAO mapper = session.getMapper(BookDAO.class);
        List<Book> list = mapper.selectMultiConditionIndex("铁",210);
        for (Book item:list){
            System.out.println(item.getBookName());
        }
        session.close();

    }

    @Test
    public void selectMultiConditionMap(){
        SqlSession session = MyBatisUtils.getSession();
        BookDAO mapper = session.getMapper(BookDAO.class);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("bookName","铁");
        map.put("bookPrice",100);
        List<Book> list = mapper.selectMultiConditionMap(map);
        for (Book item:list){
            System.out.println(item.getBookName());
        }
        session.close();
    }
    @Test
    public void selectIf(){
        SqlSession session = MyBatisUtils.getSession();
        BookDAO mapper = session.getMapper(BookDAO.class);
        Book book = new Book();
        book.setBookName("铁");
        book.setBookPrice(100);
        List<Book> list = mapper.findByIf(book);
        for (Book item:list){
            System.out.println(item.getBookName());
        }
        session.close();
    }

    @Test
    public void selectForEachListBook(){
        SqlSession session = MyBatisUtils.getSession();
        BookDAO mapper = session.getMapper(BookDAO.class);
        List<Book> listBooks = new ArrayList<Book>();
        Book book = new Book();
        book.setBookID(2);

        Book b2 = new Book();
        b2.setBookID(3);

        listBooks.add(book);
        listBooks.add(b2);
        List<Book> list = mapper.findByForEachListBook(listBooks);
        for (Book item:list){
            System.out.println(item.getBookName());
        }
        session.close();
    }

//    @Test
//    public void selectForEachList(){
//        SqlSession session = MyBatisUtils.getSession();
//        BookDAO mapper = session.getMapper(BookDAO.class);
//        List<Integer> listIds = new ArrayList<Integer>();
//        listIds.add(2);
//        listIds.add(3);
//        List<Book> list = mapper.findByForEachList(listIds);
//        for (Book item:list){
//            System.out.println(item.getBookName());
//        }
//        session.close();
//    }
}
