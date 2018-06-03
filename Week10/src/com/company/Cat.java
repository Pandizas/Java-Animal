package com.company;

public class Cat extends Mammal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String animalHabitat() {
        return "europe";
    }

    @Override
    public String animalSpecies() {
        return "cat";
    }
}
