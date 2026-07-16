package My_Projects.Student_System.src;
 import java.util.Scanner;

import student;
 class student {
    private String name;
    private int score;
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }else{
            this.name = "Unknown";
     }
    }
    public String getName() {
        return name;
    }
    public void setScore(int score) {
        if (score < 0 || score > 100) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }
    public int getScore() {
        return score;
    }
    public student (String name, int score) {
        setName(name);
        setScore(score);
    }
}
public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name then the score of the first student:");
    student student1 = new student(input.nextLine(), input.nextInt());
    input.nextLine();
    System.out.println("Name: " + student1.getName());
    System.out.println("Score: " + student1.getScore());
    System.out.println("Enter the name then the score of the second student:");
    student student2 = new student(input.nextLine(), input.nextInt());
    input.nextLine();
    System.out.println("Name: " + student2.getName());
    System.out.println("Score: " + student2.getScore());
}
}
