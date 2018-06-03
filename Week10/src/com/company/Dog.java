package com.company;

public class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String animalHabitat() {
        return "Asia";
    }

    @Override
    public String animalSpecies() {
        return "dog";
    }
}
