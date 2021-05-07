package pl.pjatk.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.core.Dog;

import java.util.Optional;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    /*alternative @PathVariable (required = false), should I use it in this case too?*/
    @GetMapping(value = {"/quote", "/quote/{quoteVariable}"})
    public ResponseEntity<String> getQuote(@PathVariable Optional<String> quoteVariable, @RequestParam Optional<String> quoteParam) {
        String firsQuote = quoteVariable.orElse("empty");
        String secondQuote = quoteParam.orElse("empty");

        return ResponseEntity.ok("qoute from variable:" + firsQuote + " qoute from Param:" + secondQuote);
    }

    @PostMapping
    public ResponseEntity<Dog> addDog(@RequestBody Dog dog) {
        return ResponseEntity.ok(new Dog(dog.getId(), dog.getName()));
    }

    /*RequestBody as text, not jason - a simplified version*/
    @PutMapping("/updateDog/{id}")
    public ResponseEntity<Dog> updateDog(@PathVariable Long id, @RequestBody String name) {
        Dog myDog = new Dog(10L, "Sławek");
        myDog.setId(id);
        myDog.setName(name);
        return ResponseEntity.ok(myDog);
    }

    @DeleteMapping("/deleteDog/{id}")
    public ResponseEntity<Void> deleteDog(@PathVariable Long id) {
        /*deleting the dog of "id"*/
        return ResponseEntity.ok().build();
    }
}
