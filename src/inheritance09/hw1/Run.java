package inheritance09.hw1;


import inheritance09.hw1.model.dto.Employee;
import inheritance09.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];
        Student hong = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        Student kim = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
        Student kang = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
        students[0] = hong;
        students[1] = kim;
        students[2] = kang;
        for (Student student : students) {
            System.out.println(student.information());
        }
        Employee[] employees = new Employee[10];
        while (true) {
            System.out.print("사원명을 입력하세요 : ");
            String empName = scanner.next();
            System.out.print("나이를 입력하세요 : ");
            int empAge = scanner.nextInt();
            System.out.print("키를 입력하세요 : ");
            double empHeight = scanner.nextDouble();
            System.out.print("몸무게를 입력하세요 : ");
            double empWeight = scanner.nextDouble();
            System.out.print("급여를 입력하세요 : ");
            int empSalary = scanner.nextInt();
            System.out.print("부서명을 입력하세요 : ");
            String empDept = scanner.next();
            employees[count] = new Employee(empName, empAge, empHeight, empWeight, empSalary, empDept);
            count++;
            System.out.print("계속 추가 하시겠습니까? : ");
            String choices = scanner.next();
            if (isChoices(choices, "n", "N")) {
                for (Employee emp : employees
                ) {
                    if (emp == null){
                        break;
                    }
                    System.out.println(emp.information());
                }
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
