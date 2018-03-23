import cn.dome02.SomeService;
import cn.dome02.SomeServiceImpl;
import cn.dome04.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MESGOD纯贱 on 2018/3/12.
 */
public class Test312 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextdome02.xml");
        SomeService someService = (SomeService)context.getBean("someService");
        someService.select();
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextaspectj.xml");
        cn.dome03.SomeService someService = (cn.dome03.SomeService)context.getBean("service");
        someService.select();
        System.out.println("-------------------------------------");
        someService.insert();
        System.out.println("-------------------------------------");
        someService.update();
        System.out.println("-------------------------------------");
        try {
            someService.delete();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextdome04.xml");
        IUserService service = (IUserService)context.getBean("service");
        try {
            service.select();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
