package mainapp;

import controller.StudentController;
import models.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Sort Students (Highest to Lowest)");
            System.out.println("4. Exit\n");
            System.out.print("Enter Your Choice : ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    StudentController.addStudent(input, students);
                    break;
                case 2:
                    StudentController.viewStudents(students);
                    break;
                case 3:
                    StudentController.sortStudents(students);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye! :)");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Please try again.\n");
                    break;
            }
        }
    }
}
