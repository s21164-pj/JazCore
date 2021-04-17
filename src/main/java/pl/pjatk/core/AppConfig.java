package pl.pjatk.core;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Dog dog(){
        return new Dog(1L, "Sławek");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public List<String> otherDefaultData() {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    @ConditionalOnProperty(
            value="module.enabled",
            havingValue = "true")
    public Cat cat() {

        return new Cat(1L, "Kotek");


    }

}
