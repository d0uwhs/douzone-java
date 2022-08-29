package api11.hw4.controller;

import api11.hw4.model.dto.Employee;

import java.util.Scanner;

public class EmpTest {
    Scanner scanner = new Scanner(System.in);
    private Employee[] employees = new Employee[6];

    public EmpTest() {
        employees[0] = new Employee("문말똥", 24, 1500000, 1.245);
        employees[1] = new Employee("장소똥", 40, 2500000, 1.4);
        employees[2] = new Employee("금개똥", 22, 1780000, 1.3);
        employees[3] = new Employee("봉쥐똥", 31, 1950000, 1.365);
        employees[4] = new Employee("홍닭똥", 34, 1650000, 1.212);

    }

    public void setEmp() {
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.print("급여를 입력하세요 : ");
        int salary = scanner.nextInt();
        System.out.print("세율을 입력하세요 : ");
        double taxRate = scanner.nextDouble();
        employees[5] = new Employee(name,age,salary,taxRate);


    }

    public void printEmp() {
        System.out.println("-----정렬 이전 -----");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void nameSortPrint() {
        System.out.println("-----정렬 이후 -----");
        for(int i = 1; i < employees.length; i++) {
            for(int j = 0; j < employees.length; j++) {
                if(employees[j].getName().compareTo(employees[i].getName()) > 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }
}
