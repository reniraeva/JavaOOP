package com.animal;

public class KittyCat extends Cat {

    public KittyCat(String name, int age) {

        super(name, age, Gender.Female);
    }

    @Override
    public String sound() {
        return "Kitty sound: miauuuu";
    }
}
