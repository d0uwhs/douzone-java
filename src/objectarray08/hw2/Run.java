package objectarray08.hw2;

import objectarray08.hw2.dto.Student;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        while (true) {
            System.out.print("학년을 입력하세요 : ");
            int studentGrade = scanner.nextInt();
            System.out.print("반을 입력하세요 : ");
            int studentClassroom = scanner.nextInt();
            System.out.print("이름을 입력하세요 : ");
            String studentName = scanner.next();
            System.out.print("국어점수를 입력하세요 :");
            int studentKor = scanner.nextInt();
            System.out.print("영어점수를 입력하세요 :");
            int studentEng = scanner.nextInt();
            System.out.print("수학점수를 입력하세요 : ");
            int studentMath = scanner.nextInt();
            Student student = new Student(studentGrade, studentClassroom, studentName, studentKor, studentEng, studentMath
            );
            students[count] = student;
            count++;
            System.out.print("계속 추가 하시겠습니까? : ");

            String choices = scanner.next();
            double average = 0;
            if (isChoices(choices, "n", "N")) {
                for (Student stdnt : students
                ) {
                    if (stdnt == null){
                        break;
                    }
                    average += stdnt.getAverage();
                    System.out.println(stdnt.information());
                    System.out.println(stdnt.getName() + "의 평균 점수 : " + stdnt.getAverage());
                }

                System.out.println("모든 학생의 평균 점수 : " + String.format("%.3f",average/count));
                break;
            }
            if (isChoices(choices, "y", "Y")) {
                continue;
            }
        }
    }
    private static boolean isChoices(String choices, String n, String N) {
        return choices.equals(n) || choices.equals(N);
    }
}
