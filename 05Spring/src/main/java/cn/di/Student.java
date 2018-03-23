package cn.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by MESGOD纯贱 on 2018/3/6.
 */
@Component("stu")
public class Student {
    @Value("高尚的动物世界")
    private String name;
    @Value("19")
    private Integer age;
    // @Resource(name = "car")  jdk 自己的注解
    @Autowired   //Spring 的注解
    @Qualifier(value = "car")
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
