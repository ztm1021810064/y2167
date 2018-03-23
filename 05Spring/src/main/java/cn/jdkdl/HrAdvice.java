package cn.jdkdl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class HrAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before====");
        methodInvocation.proceed();
        System.out.println("after====");
        return null;
    }
}
