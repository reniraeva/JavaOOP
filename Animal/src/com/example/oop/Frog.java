package com.example.oop;

public class Frog extends Animal {

    public Frog(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public String sound() {

        return "Frog sound: kva-kva-kvak";
    }
}
