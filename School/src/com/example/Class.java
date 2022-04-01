package com.example;

import java.util.HashSet;
import java.util.Set;

public class Class implements IEquitable,ICommentable {

    private String name;
    private String comment;
    private Set<Teacher> teachers = new HashSet<>();
    private Set<Student> students = new HashSet<>();

    public Class(String name) {
        setName(name);
    }

    public boolean equals(Class other){
        return this.getName().equals(other.getName());
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Class addTeacher(Teacher[] allTeachers){
        for (Teacher teacher : allTeachers) {
            this.teachers.add(teacher);
        }
        return this;
    }

    public void removeTeacher(Teacher teacher){
        this.teachers.remove(teacher);
    }

    public Class addStudent(Student[] allStudents){
        for (Student student  : allStudents) {
            this.students.add(student);
        }
        return this;
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("Class %s:", getName()));

        if (this.teachers.size() > 0) {
            info.append("%n Teachers: ");

            for (Teacher teacher : this.teachers) {
                info.append("%n " + teacher);
            }
        }

        if (this.students.size() > 0){
            info.append("%n Students: ");

            for (Student student : this.students){
                info.append("%n " + student);
            }
        }

        return info.toString();

    }
}
