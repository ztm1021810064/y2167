package cn.jdkdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class Test {
    public static void main(String[] args) {
      final SomeService service = new SomeServiceImpl();

      SomeService proxy =(SomeService)Proxy.newProxyInstance(service.getClass().getClassLoader(),
              service.getClass().getInterfaces(), new InvocationHandler() {
                  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                      System.out.println("before=======");
                      method.invoke(service,args);
                      return null;
                  }
              });
      proxy.doSome();
    }
}
