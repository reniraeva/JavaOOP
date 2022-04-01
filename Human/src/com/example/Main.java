package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Human> humanList = new ArrayList<>();
        Human studentFirst = new Student("Ivailo", "Marinov", 4);
        Human studentSecond = new Student("Stanislav", "Dimitrov", 12);
        Human studentThird = new Student("Cvetelina", "Belcheva", 2);
        Human studentFourth= new Student("Kaloyan", "Marinov", 7);
        Human workerFirst = new Worker("Lubomir", "Marinov",2585.15);
        Human workerSecond = new Worker("Pavlina", "Belcheva",1457.49);
        Human workerThird = new Worker("Marin", "Kaloyanov", 932.93);

        humanList.add(studentFirst);
        humanList.add(studentSecond);
        humanList.add(studentThird);
        humanList.add(studentFourth);
        humanList.add(workerFirst);
        humanList.add(workerSecond);
        humanList.add(workerThird);

        System.out.println("List of:");
        for (Human human: humanList) {
            System.out.println(human);
        }

    }
}
