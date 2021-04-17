package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
        System.out.println("component 3 start");
        myFirstComponent.printHello();
        mySecondComponent.printHello();
    }

    public void printHello() {
        System.out.println("Hello from method C3");
    }
}
