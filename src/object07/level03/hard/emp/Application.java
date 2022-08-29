package object07.level03.hard.emp;



import object07.level03.hard.emp.model.dto.EmployeeDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDto employeeDto = new EmployeeDto();
        System.out.print("사번 : ");
        employeeDto.setNumber(sc.nextInt());
        System.out.print("이름 : ");
        employeeDto.setName(sc.next());
        System.out.print("부서 : ");
        employeeDto.setJob(sc.next());
        System.out.print("나이 : ");
        employeeDto.setAge(sc.nextInt());
        System.out.print("성별 : ");
        employeeDto.setGender(sc.next().charAt(0));
        System.out.print("급여 : ");
        employeeDto.setSalary(sc.nextInt());
        System.out.print("보너스포인트 : ");
        employeeDto.setBonusPoint(sc.nextDouble());
        System.out.print("휴대폰번호 : ");
        employeeDto.setPhone(sc.next());
        System.out.print("주소 : ");
        employeeDto.setAddress(sc.next());

        System.out.println(employeeDto.getNumber());
        System.out.println(employeeDto.getName());
        System.out.println(employeeDto.getJob());
        System.out.println(employeeDto.getAge());
        System.out.println(employeeDto.getGender());
        System.out.println(employeeDto.getSalary());
        System.out.println(employeeDto.getBonusPoint());
        System.out.println(employeeDto.getPhone());
        System.out.println(employeeDto.getAddress());
    }
}
