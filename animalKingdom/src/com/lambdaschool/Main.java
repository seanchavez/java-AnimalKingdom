package com.lambdaschool;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(new Mammals("Panda", 1869));
        System.out.println(animals);
    }
}
