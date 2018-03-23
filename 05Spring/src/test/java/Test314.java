import cn.dome05.enetity.Book;
import cn.dome05.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by MESGOD纯贱 on 2018/3/13.
 */
public class Test314 {

    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("dome05.xml");
        BookService service = (BookService)context.getBean("bookService");
        List<Book> list = service.list();

        for (Book item:list) {
            System.out.println(item.getBookName());
        }

    }
}
