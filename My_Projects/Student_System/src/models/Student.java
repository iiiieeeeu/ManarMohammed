package models;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        setName(name);
        setScore(score);
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
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

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.score, this.score);
    }
}