package com.company;

public class Lizard extends Reptile {
    public Lizard(String name, int age) {
        super(name, age);
    }

    @Override
    public String animalHabitat() {
        return "Bulgaria";
    }

    @Override
    public String animalSpecies() {
        return "lizard";
    }
}
