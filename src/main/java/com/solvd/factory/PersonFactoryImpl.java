package com.solvd.factory;

import com.solvd.Manager;
import com.solvd.Employee;
import com.solvd.Person;

public class PersonFactoryImpl implements AbstractFactory<Person> {

    @Override
    public Person create(String type) {
        switch (type.toLowerCase()) {
            case "manager":
                return new Manager();
            case "employee":
                return new Employee();
            default:
                return new Person();
        }
    }
}