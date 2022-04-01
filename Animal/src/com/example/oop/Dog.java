package com.example.oop;

public class Dog extends Animal {

    public Dog(String name, int age, Gender gender) {

        super(name, age, gender);
    }

    @Override
    public String sound() {

        return "Dog sound: bay-bay";
    }
}
