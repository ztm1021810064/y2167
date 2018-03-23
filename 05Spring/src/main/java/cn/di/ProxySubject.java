package cn.di;

/**
 * Created by MESGOD纯贱 on 2018/3/6.
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject = new RealSubject();
    public void request() {
        System.out.println("之前");
        realSubject.request();
        System.out.println("之后");
    }
}
