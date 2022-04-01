package com.example.oop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = new ArrayList<>();

        Animal dogOne = new Dog("Sharo", 4, Gender.Male);
        Animal dogTwo = new Dog("SomeDog", 5, Gender.Female);
        Animal frogOne = new Frog("Crazy frog", 50, Gender.Male);
        Animal frogTwo = new Frog("Sick frog", 2, Gender.Female);
        animalsList.add(dogOne);
        animalsList.add(dogTwo);
        animalsList.add(frogOne);
        animalsList.add(frogTwo);

        List<Cat> catsList = new ArrayList<>();

        Cat catOne = new KittyCat("Queen", 5);
        Cat catTwo = new KittyCat("Princess", 2);
        Cat catThree =new TomCat("King", 3);
        Cat catFour = new TomCat("SomeCat", 2);
        catsList.add(catOne);
        catsList.add(catTwo);
        catsList.add(catThree);
        catsList.add(catFour);


        for (Animal animal :animalsList) {
            System.out.println(animal);
        }

        System.out.println("Cats:");
        for (Cat cat: catsList) {
            System.out.println(cat);
        }

    }
}
