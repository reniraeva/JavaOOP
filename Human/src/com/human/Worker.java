package com.human;

public class Worker extends Human{

    private  double workSalary = 0;

    public Worker(String firstName, String lastName, double workSalary) {
        super(firstName, lastName);
        setWorkSalary(workSalary);
    }

    public double getWorkSalary() {

        return this.workSalary;
    }

    public void setWorkSalary(double workSalary) {
        if (workSalary <= 0){
            throw new ArithmeticException("Salary is not in regal!");
        }
        this.workSalary = workSalary;
    }

    @Override
    public String toString() {
        return String.format("Worker: %s %s, Salary: %.2f",getFirstName(),getLastName(),getWorkSalary());
    }
}
