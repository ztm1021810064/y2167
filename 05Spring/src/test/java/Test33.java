import cn.dao.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MESGOD纯贱 on 2018/3/3.
 */
public class Test33 {

    @Test
    public void Spring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring spring = (HelloSpring) context.getBean("helloSpring");
        System.out.println(spring.getName()+spring.getAge());
    }
}
