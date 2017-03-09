package com.github.aelmod.oop.encapsulation.abstraction.students;

public class Student {
    private String name;
    private int id;
    private static int idGenerator = 1;

    public Student(String name) {
        this.name = name;
        this.id = idGenerator++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
