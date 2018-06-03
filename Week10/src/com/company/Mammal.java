package com.company;

public abstract class Mammal implements IAnimalWorld {
        String name;
        int age;

        public Mammal(String name, int age) {
            this.name = name;
            this.age = age;
        }

    @Override
    public  String animalType() {
        return "mammal";
    }

    @Override
    public abstract String animalHabitat();

    @Override
    public abstract String animalSpecies();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", type: " + animalType() + ", habitat: "
                + animalHabitat() +  ", species: " + animalSpecies();
    }
}
