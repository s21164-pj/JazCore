package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {

    public MyFirstComponent(List<String> otherDefaultData, @Value("${my.custom.property ?: my default system property value}") String property) {
        System.out.println(otherDefaultData);
        System.out.println("component 1 start");
        System.out.println(property);
    }

    public void printHello() {
        System.out.println("Hello from method C1");
    }



}
