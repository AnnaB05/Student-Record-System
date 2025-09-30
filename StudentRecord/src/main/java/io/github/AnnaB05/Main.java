package io.github.AnnaB05;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        //Add sample students
        manager.addStudent(new Student(1235, "Alice", 3.5));
        manager.addStudent(new Student(5321, "Bob", 3.8));
        //Print them
        manager.printAllStudents();
        //Search by id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        Student foundStudent = manager.findStudentById(id);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent);
        }else {
            System.out.println("Student with ID " + id + " not found.");
        }
        //Find one by id
        Student student = manager.findStudentById(1);


        }
    }