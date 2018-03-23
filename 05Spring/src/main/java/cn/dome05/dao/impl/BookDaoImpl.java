package cn.dome05.dao.impl;

import cn.dome05.dao.IBookDao;
import cn.dome05.enetity.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by MESGOD纯贱 on 2018/3/13.
 */
public class BookDaoImpl extends JdbcDaoSupport implements IBookDao {
    String sql ="select * from book";
    public List<Book> findAllBook() {
        List<Book> list = this.getJdbcTemplate().query(sql,new RowMapper<Book>() {
            public Book mapRow(ResultSet rs, int i) throws SQLException {
                Book book = new Book();
                book.setBookID(rs.getInt("bookID"));
                book.setBookName(rs.getString("bookName"));
                book.setBookAuthor(rs.getString("bookAuthor"));
                book.setBookPrice(rs.getInt("bookPrice"));
                return book;
            }
        });
        return list;
    }
}
