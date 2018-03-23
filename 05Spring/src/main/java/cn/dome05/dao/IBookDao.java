package cn.dome05.dao;

import cn.dome05.enetity.Book;

import java.util.List;

/**
 * Created by MESGOD纯贱 on 2018/3/13.
 */
public interface IBookDao {
    public List<Book> findAllBook();
}
