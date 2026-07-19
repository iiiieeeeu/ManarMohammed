package My_Projects.Student_System.src;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----Student Management system----");
            System.out.println("1. add Student \n2. View Student " + "\n"
                    + "3. Sort Student (Highest to Lowest)\n4. Exit  \n");
            System.out.printf("Enter Your Choice : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    input.nextLine();
                    System.out.printf("Enter Student Name :  \n");
                    String name = input.nextLine();
                    System.out.printf("Enter Student Score :  \n");
                    int score = input.nextInt();
                    Student student = new Student(name, score);
                    students.add(student);
                    System.out.printf("Student Added Successfully (:  \n");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.printf("No Students found . please add some first (:  \n");
                    } else {
                        System.out.printf(" \n----Student List----- \n");
                        System.out.printf("%-20s %-10s \n", "Name", "score");
                        System.out.printf("------------------------------ \n");
                        for (Student s : students) {
                            System.out.printf("%-20s %-10d \n", s.getName(), s.getScore());
                        }
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.printf("No Students to sort  \n");
                    } else {
                        Collections.sort(students);
                        System.out.printf("Students sorted Successfully (Highest to Lowest)  \n");
                        System.out.printf("Press 2 to view the sorted list (:  \n");
                    }
                    break;
                case 4:
                    System.out.printf("Exiting program . Goodbye (:  \n");
                    return;
                default:
                    System.out.printf("Invalid Choice! Please try again.  \n");
                    break;
            }
        }
    }
}
