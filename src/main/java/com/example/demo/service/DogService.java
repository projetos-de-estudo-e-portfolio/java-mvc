package com.example.demo.service;

import com.example.demo.model.Dog;
import com.example.demo.model.MockDogProvider;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Setter
public class DogService {
    final MockDogProvider mockDogProvider;

    public void add(Dog dog) {
        mockDogProvider.add(dog);
    }

    public void delete(long id) {
        mockDogProvider.delete(id);
    }

    public List<Dog> getDogs() {
        return mockDogProvider.getDogs();
    }

    public Dog getDogById(long id) {
        return mockDogProvider.findDogById(id);
    }
}