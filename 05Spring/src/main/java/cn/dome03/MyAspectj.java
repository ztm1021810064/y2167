package cn.dome03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.util.LangUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by MESGOD纯贱 on 2018/3/12.
 */
@Aspect
public class MyAspectj {
    @Pointcut("execution(* *..dome03.*.insert(..))")
    public void insert(){

    }
    @Before("insert()")
    public void Before(){
        System.out.println("前置增强");
    }

//    @AfterReturning("execution(* *..dome03.*.select(..))")
//    public void AfterReturning(){
//        System.out.println("后置增强");
//    }
    @AfterThrowing("execution(* *..dome03.*.delete(..))")
    public void AfterThrowing(){
        System.out.println("哈哈？？？？？？？？？？？哈哈");
    }
    @Around("execution(* *..dome03.*.update(..))")
    public void AroundAspectj(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        pj.proceed();
        System.out.println("环绕后");
    }
    @After("execution(* *..dome03.*.select(..))")
    public void After(){
        System.out.println("最后的最后，渴望变成天使");
    }


}
