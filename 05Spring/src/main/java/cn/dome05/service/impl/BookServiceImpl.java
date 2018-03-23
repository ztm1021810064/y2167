package cn.dome05.service.impl;
import cn.dome05.dao.IBookDao;
import cn.dome05.enetity.Book;
import cn.dome05.service.BookService;

import java.util.List;

/**
 * Created by MESGOD纯贱 on 2018/3/13.
 */
public class BookServiceImpl implements BookService {
    IBookDao dao;
    public List<Book> list() {
        return dao.findAllBook();
    }

    public IBookDao getDao() {
        return dao;
    }

    public void setDao(IBookDao dao) {
        this.dao = dao;
    }
}
