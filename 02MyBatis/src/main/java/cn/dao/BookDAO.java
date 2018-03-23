package cn.dao;
import cn.entity.Book;

import java.util.List;
import java.util.Map;

/**
 * Created by MESGOD纯贱 on 2018/1/29.
 */
public interface BookDAO {
    //查询书籍
    public Book selectBook(Integer bookID);

    public List<Book> selectMultiConditionIndex(String bookName, Integer bookPrice);

    public List<Book> selectMultiConditionMap(Map<String,Object>map);

    //智能if标签
    public List<Book> findByIf(Book book);
    //智能标签 forEach array
    public List<Book> findByForEachArray(int[] bookids);
   //智能标签 foreach list
    public List<Book> findByForEachList(List<Integer> list);
    //智能标签 foreach list 自定义类型
    public List<Book> findByForEachListBook(List<Book> list);
}
