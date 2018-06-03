package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mammal cat = new Cat("Valio", 20);
        Mammal dog = new Dog("Ivan_Pedal", 22);

        Reptile lizard = new Lizard("Pedi", 23);

        ArrayList<IAnimalWorld> animals = new ArrayList<IAnimalWorld>();
        
        animals.add(cat);
        animals.add(dog);
        animals.add(lizard);

        for (IAnimalWorld animal: animals) {
            System.out.println(animal.toString());
        }
    }
}
