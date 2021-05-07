package pl.pjatk.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.core.Cat;
import pl.pjatk.core.Dog;

@RestController
@RequestMapping("/test")
public class JazRestController {
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Dog> getMyDog() {
        return ResponseEntity.ok(new Dog(2L, "Sławek"));
    }

    @PostMapping("/model")
    public ResponseEntity<Dog> addDog(@RequestBody Dog dog) {
        return ResponseEntity.ok(dog);
    }
}
