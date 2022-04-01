package com.human;

public class Student extends Human{

    private int grade = 0;

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        setGrade(grade);

    }
    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        if (grade <=0 || grade>12){
            throw new ArithmeticException("Grade is not in range!");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student: %s %s, Grade: %d", getFirstName(), getLastName(), getGrade());
    }
}
