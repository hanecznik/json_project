package com.solvd.strategy;

import com.solvd.Person;

public class SimplePersonStrategy implements PersonProcessingStrategy {
    @Override
    public void process(Person person) {
        System.out.println("Processing simple info for: " + person.getName());
    }
}
