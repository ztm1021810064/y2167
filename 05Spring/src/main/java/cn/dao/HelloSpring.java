package cn.dao;

/**
 * Created by MESGOD纯贱 on 2018/3/3.
 */
public class HelloSpring {
    private String name;

    private Integer age;

    public  HelloSpring(){
        System.out.println("========");
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
