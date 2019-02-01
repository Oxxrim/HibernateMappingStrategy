package com.internship.dao;

import com.internship.domain.Dog;

public class DogDAO {

    public void save() {
        Dog dog = new Dog();

        dog.setType("animal");
        dog.setName("Rich");
        dog.setAverageTimeOfLife(10);
        dog.setOwner("Roma");

        DAOUtil.save(dog);

    }
}
