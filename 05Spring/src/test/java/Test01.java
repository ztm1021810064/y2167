import cn.aop.service.HelloService;
import cn.demo.MyCollection;
import cn.demo.Stu;
import cn.printer.printer.Printer;
import com.sun.prism.j2d.print.J2DPrinterJob;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MESGOD纯贱 on 2018/3/3.
 */
public class Test01 {

    @Test
    public void printer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextPrinter*.xml");
        Printer printer = (Printer) context.getBean("Printer");
        printer.print();
    }

    @Test
    public void aopService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAop.xml");
        HelloService service =(HelloService) context.getBean("HelloService");
        service.doSome();
    }

    @Test
    public void stu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextdemo1.xml");
        Stu stu =(Stu) context.getBean("stu");
        stu.getName();
        stu.getAge();
//        stu.getCar().getColor();
//        stu.getCar().getType();
        System.out.println(stu.getName()+stu.getAge());
    }

    @Test
    public void collection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextdemo1.xml");
        MyCollection collection = (MyCollection)context.getBean("collection");
        System.out.println(collection.toString());
    }

    public void student(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDemo.xml");
        Stu stu =(Stu) context.getBean("stu");
        stu.getName();
        stu.getAge();
//        stu.getCar().getColor();
//        stu.getCar().getType();
        System.out.println(stu.getName()+stu.getAge());
    }

}
