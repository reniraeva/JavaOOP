package com.human;

abstract class Human {

    private String firstName = "";
    private String lastName = "";

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.isEmpty()) {
            throw new ArithmeticException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.isEmpty()) {
            throw new ArithmeticException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

}
