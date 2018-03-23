package cn.di;

/**
 * Created by MESGOD纯贱 on 2018/3/6.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("这是真实对象");
    }
}
