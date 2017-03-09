package com.github.aelmod.oop.encapsulation.abstraction.students;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group {
    private Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student removeStudent(Student student) {
        students.remove(student);
        return student;
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("user not be finded");
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (Objects.equals(student.getName(), name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("user not be finded");
    }

    public Set<Student> getAllStudents() {
        return Collections.unmodifiableSet(students);
    }
}
