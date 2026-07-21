package controller;

import models.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentController {

    public static void addStudent(Scanner input, ArrayList<Student> students) {
        System.out.print("Enter Student Name : ");
        String name = input.nextLine();

        System.out.print("Enter Student Score (0-100) : ");
        int score = input.nextInt();
        input.nextLine(); 

        Student student = new Student(name, score);
        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    public static void viewStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No Students to display.\n");
            return; 
        }
        
        System.out.printf("%-20s %-10s \n", "Name", "Score");
        System.out.println("------------------------------");
        for (Student s : students) {
            System.out.printf("%-20s %-10d \n", s.getName(), s.getScore());
        }
        System.out.println(); 
    }

    public static void sortStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No Students to sort.\n");
            return; 
        }
        
        Collections.sort(students); 
        
        System.out.println("Students sorted by score (Highest to Lowest):");
        viewStudents(students); 
    }
}