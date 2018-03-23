package cn.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by MESGOD纯贱 on 2018/3/6.
 */
@Component("car")
public class Car {
    @Value("Red")
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
