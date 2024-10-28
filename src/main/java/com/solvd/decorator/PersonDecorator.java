package com.solvd.decorator;

import com.solvd.Person;

public class PersonDecorator {
    protected final Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    public String getDecoratedName() {
        return "Mr./Ms. " + person.getName();
    }
}
