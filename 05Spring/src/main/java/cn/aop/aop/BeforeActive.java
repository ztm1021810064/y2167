package cn.aop.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by MESGOD纯贱 on 2018/3/5.
 */
public class BeforeActive implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("写点什么吧！！！");
    }
}
