package cn.dome07.entity;

/**
 * Created by MESGOD纯贱 on 2018/3/17.
 */
public class Book {
    private Integer bookID;
    private String bookName;
    private String bookAuthor;
    private Integer bookPrice;
    public Integer getBookID() {
        return bookID;
    }
    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public Integer getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }
}
