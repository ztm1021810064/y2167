import cn.di.ProxySubject;
import cn.di.Student;
import cn.jdkdl.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MESGOD纯贱 on 2018/3/6.
 */
public class Test02 {
    @Test
    public void di(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDi.xml");
        Student student = (Student) context.getBean("stu");
        System.out.println(student.getName()+student.getAge());
        System.out.println(student.getCar().getColor());
    }

    @Test
    public void subject(){
        ProxySubject proxySubject = new ProxySubject();

        proxySubject.request();
    }
    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAop04.xml");
        SomeService service = (SomeService) context.getBean("proxyService");
            service.doSome();
            service.doAny();
    }
}
