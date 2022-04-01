package com.example.oop;

public class TomCat extends Cat {
    public TomCat(String name, int age) {
        super(name, age, Gender.Male);
    }

    @Override
    public String sound() {
        return "Tom sound: mau-mau";
    }
}
