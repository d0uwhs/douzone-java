package object07.level02.normal.student;



import object07.level02.normal.student.model.dto.StudentDto;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDto studentDto = new StudentDto();
        System.out.print("학년 : ");
        studentDto.setGrade(sc.nextInt());
        System.out.print("반 : ");
        studentDto.setClassroom(sc.nextInt());
        System.out.print("이름 : ");
        studentDto.setName(sc.next());
        System.out.print("키 : ");
        studentDto.setHeight(sc.nextDouble());
        System.out.print("성별 : ");
        studentDto.setGender(sc.next().charAt(0));
        System.out.println(studentDto.printInformation());
    }
}
