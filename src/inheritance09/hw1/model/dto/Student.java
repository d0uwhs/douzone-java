package inheritance09.hw1.model.dto;

public class Student extends Person {
    private int grade; // 학년
    private String major; // 전공

    @Override
    public String information() {
        return super.information() +
                " 학년=" + grade +
                ", 전공='" + major;
    }

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight); // age, height, weight 는 부모 생성자를 통해 초기화
        super.setName(name);
        this.grade = grade;
        this.major = major;
    }
}
