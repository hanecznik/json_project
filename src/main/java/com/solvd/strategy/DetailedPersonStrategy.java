package com.solvd.strategy;

import com.solvd.Person;

public class DetailedPersonStrategy implements PersonProcessingStrategy {
    @Override
    public void process(Person person) {
        System.out.println("Processing detailed info for: " + person.getName() + ", age: " + person.getAge());
    }
}
