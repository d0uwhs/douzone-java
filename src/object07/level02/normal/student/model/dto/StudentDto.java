package object07.level02.normal.student.model.dto;

public class StudentDto {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentDto() {}

    public StudentDto(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String printInformation() {
        return "StudentDto{" +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
