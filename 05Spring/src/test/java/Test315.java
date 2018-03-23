import cn.dome06.enetity.cgyException;
import cn.dome06.service.cgyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MESGOD纯贱 on 2018/3/15.
 */
public class Test315 {
    @Test
    public void t1() throws cgyException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextdome06.xml");
        cgyService service = (cgyService)ctx.getBean("cgyService");
        try{
            service.cgy(1,10000,1,100);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
