package io.github.AnnaB05;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        //Initialize student list
        students = new ArrayList<>();
    }

    public void addStudent (Student student) {
        // Add student to list
        students.add(student);
    }

    public Student findStudentById(int id) {
        // Loop through list, return matching student
        for (Student student : students) {
            if (student.id() == id) {
                return student;
            }
        }
        // If no match, return null
        return null;
    }

    public void printAllStudents() {
        //Loop through list and print students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
