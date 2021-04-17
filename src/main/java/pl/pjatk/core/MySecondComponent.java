package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    private final MyFirstComponent myFirstComponent;

    public MySecondComponent(MyFirstComponent myFirstComponent) {
        this.myFirstComponent = myFirstComponent;
        System.out.println("component 2 start");
        myFirstComponent.printHello();
    }

    public void printHello() {
        System.out.println("Hello from method C2");
    }
}
