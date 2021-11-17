package com.example.demo.web;

import com.example.demo.model.Dog;
import com.example.demo.service.DogService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
@RequiredArgsConstructor
@Setter
public class DogsController {
    @Autowired private final DogService service;

    @GetMapping
    public ResponseEntity<List<Dog>> getDogs() {
        return service.getDogs();
    }

    @PostMapping
    public void postDogs(@RequestBody Dog dog) {
        service.add(dog);
    }

    @GetMapping("/{id}")
    public Dog getById(@PathVariable(required = true) long id) {
        return service.getDogById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}