package cn.dome07.service;

import cn.dome07.dao.IBookDao;
import cn.dome07.entity.Book;

/**
 * Created by MESGOD纯贱 on 2018/3/17.
 */
public class BookServiceImpl implements IBookService {
    private IBookDao bookDao;
    public int addBook(Book book) throws Exception {
        return bookDao.addBook(book);
    }

    public IBookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(IBookDao bookDao) {
        this.bookDao = bookDao;
    }
}
