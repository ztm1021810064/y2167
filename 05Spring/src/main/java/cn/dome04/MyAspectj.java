package cn.dome04;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by MESGOD纯贱 on 2018/3/12.
 */
public class MyAspectj {

    public void before(){
        System.out.println("前置增强");
    }

    public void afterReturning(){
        System.out.println("后置增强");
    }

    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        pj.proceed();
        System.out.println("环绕后");
    }

    public void afterThrow(Exception e){
        System.out.println("你为什么出异常？？？？？？？？？");
    }

    public void after(){
        System.out.println("最后的最后");
    }
}
