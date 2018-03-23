package cn.aop.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by MESGOD纯贱 on 2018/3/5.
 */
public class AfterActive implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("写aop增强代码，对吧！！！");
    }
}
