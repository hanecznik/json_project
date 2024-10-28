package com.solvd.factory;

import com.solvd.Person;
public interface AbstractFactory<T extends Person> {
    T create(String type);
}
