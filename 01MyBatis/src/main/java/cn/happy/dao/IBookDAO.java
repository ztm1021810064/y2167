package cn.happy.dao;

import cn.happy.entity.Book;

import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-01-29.
 */
public interface IBookDAO {
    //01.获取所有图书集合  alt+Enter
    public List<Book> findAllBooks();
    //02.添加图书  未来已来 （马云）  预约死亡(毕淑敏)   你所认为的极限，只是别人的起点  X姐
    public int addBook(Book book);
    //删除
    public  int delBook(int bookid);
    //修改
    public int updateBook(Book book);
    //根据主键查询单个图书对象
    public Book findOneBookByPrimaryKey(int bookid);
    //模糊查询
    public  List<Book> likeSelect(String bookName);
    //添加后返回ID
    public int insertBook(Book book);
    //多条件查询Map   图书名称包含 "四"  并且 价格>30的图书
    public List<Book> selectMultiConditionMap(Map<String, Object> map);
    //多条件查询Index   图书名称包含 "四"  并且 价格>30的图书
    public List<Book> selectMultiConditionIndex(String bookName, Integer bookPrice);
    //智能标签if
    public List<Book> findByIf(Book book);
    //智能标签choose
    public List<Book> findByChoose(Book book);
    //智能标签 foreach array
    public List<Book> findByForEachArray(int[] bookids);
    //智能标签 foreach list
    public List<Book> findByForEachList(List<Integer> list);
    //智能标签 foreach list 自定义类型
    public List<Book> findByForEachListBook(List<Book> list);


}

