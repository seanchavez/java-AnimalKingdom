package com.lambdaschool;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(new Mammals("Panda", 1869));
        animals.add(new Mammals("Panda", 1778));
        animals.add(new Mammals("Koala", 1816));
        animals.add(new Mammals("Sloth", 1804));
        animals.add(new Mammals("Armadillo", 1758));
        animals.add(new Mammals("Raccoon", 1758));
        animals.add(new Mammals("Bigfoot", 2021));

        animals.add(new Birds("Pigeon", 1837));
        animals.add(new Birds("Peacock", 1821));
        animals.add(new Birds("Toucan", 1758));
        animals.add(new Birds("Parrot", 1824));
        animals.add(new Birds("Swan", 1758));

        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1758));
        animals.add(new Fish("Perch", 1758));

        for (Animals animal : animals) {
            System.out.println(animals.getName());
        }

    }
}
