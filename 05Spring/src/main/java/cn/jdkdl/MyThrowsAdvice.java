package cn.jdkdl;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by MESGOD纯贱 on 2018/3/8.
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("网络异常......");
    }
}
