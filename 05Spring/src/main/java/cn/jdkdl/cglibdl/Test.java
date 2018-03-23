package cn.jdkdl.cglibdl;

import cn.jdkdl.SomeService;
import cn.jdkdl.SomeServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class Test {
    public static void main(String[] args) {
        final SomeServiceImpl someService = new SomeServiceImpl();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(someService.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("=======before");
                methodProxy.invoke(someService,objects);
                return null;
            }
        });
        SomeServiceImpl proxy = (SomeServiceImpl) enhancer.create();
        proxy.doSome();
    }
}
