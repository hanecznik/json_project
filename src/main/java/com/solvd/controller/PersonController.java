package com.solvd.controller;

import com.solvd.Person;
import com.solvd.view.PersonView;

public class PersonController {
    private final Person model;
    private final PersonView view;

    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void updatePersonName(String name) {
        model.setName(name);
    }

    public void updatePersonAge(int age) {
        model.setAge(age);
    }

    public void displayPerson() {
        view.displayPersonDetails(model);
    }
}
