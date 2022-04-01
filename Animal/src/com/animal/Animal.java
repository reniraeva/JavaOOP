package com.animal;

abstract class Animal {
    private String name = "";
    private int age = 0;
    private Gender gender;

    public Animal(String name, int age, Gender gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        if (name != null && name.isEmpty()){
            throw new ArithmeticException("Name cannot be null or empty!");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 100){
            throw new ArithmeticException("Age must be less than 100!");
        }
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public abstract String sound();

    @Override
    public String toString() {

        return String.format("Name: %s, Age: %d, Gender: %s",getName(), getAge(),getGender());
    }
}
