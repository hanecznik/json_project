package com.solvd.view;

import com.solvd.Person;

public class PersonView {
    public void displayPersonDetails(Person person) {
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
