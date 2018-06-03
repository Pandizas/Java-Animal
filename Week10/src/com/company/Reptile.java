package com.company;

public abstract class Reptile  implements IAnimalWorld{
    String name;
    int age;

    public Reptile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String animalType() {
        return "Animal type - reptile";
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
