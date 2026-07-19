
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("----Student Management system----");
            System.out.println("1. add Student \n2. View Student " + "\n"
                    + "3. Sort Student (Highest to Lowest)\n4. Exit  \n");
            System.out.printf("Enter Your Choice : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    AddStudent(input, students);
                    break;
                case 2:
                    viewStudents(students);
                    break;
                case 3:
                    sortStudents(students);
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

    

    public static void AddStudent(Scanner input, ArrayList<Student> students) {
        System.out.printf("Enter Student Name : ");
        String name = input.next();
        System.out.printf("Enter Student Score (0-100) : ");
        int score = input.nextInt();
        Student student = new Student(name, score);
        students.add(student);
        System.out.printf("Student added successfully!  \n");

    }

    public static void viewStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.printf("No Students to display  \n");
        } else {
            System.out.printf("%-20s %-10s \n", "Name", "score");
            System.out.printf("------------------------------ \n");
            for (Student s : students) {
                System.out.printf("%-20s %-10d \n", s.getName(), s.getScore());
            }

        }
    }

    public static void sortStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.printf("No Students to sort  \n");
        } else {
            Collections.sort(students, (s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
            System.out.printf("Students sorted by score (Highest to Lowest):  \n");
            for (Student s : students) {
                System.out.printf("%-20s %-10d \n", s.getName(), s.getScore());
            }
        }

    }
}
