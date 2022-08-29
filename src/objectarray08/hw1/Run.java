package objectarray08.hw1;

import objectarray08.hw1.dto.Employee;

import java.math.BigDecimal;

public class Run {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee();
        employees[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employees[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
        for (Employee emp : employees
        ) {
            System.out.println(emp.information());
        }
        System.out.println("=====================================================");
        employees[0].setEmpNo(0);
        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('M');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("전라도 광주");
        //
        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);
        System.out.println(employees[0].information());
        System.out.println(employees[1].information());
        System.out.println("=====================================================");
        /**
         * BigDecimal로 지수표현범위 늘림
         * https://conservative-vector.tistory.com/entry/%EC%9E%90%EB%B0%94-%EC%88%AB%EC%9E%90-%ED%91%9C%ED%98%84BigDecimal
         *
         */
        BigDecimal kim = new BigDecimal(getTotalSalaryFromEmployee(employees, 0));
        BigDecimal hong = new BigDecimal(getTotalSalaryFromEmployee(employees, 1));
        BigDecimal kang = new BigDecimal(getTotalSalaryFromEmployee(employees, 2));

        System.out.println("김말똥의 연봉 : " + kim + "원");
        System.out.println("홍길동의 연봉 : " + hong + "원");
        System.out.println("강말순의 연봉 : " + kang + "원");

        BigDecimal total = new BigDecimal(0);
        total.add(kim);
        total.add(kang);
        total.add(hong);
        int average = 0;
        for (int d = 0; d < employees.length; d++) {
            average += getTotalSalaryFromEmployee(employees, d);
        }
        System.out.println("직원들의 연봉의 평균 : " +average/employees.length +  "원");
    }

    private static double getTotalSalaryFromEmployee(Employee[] employees, int indenNum) {
        return (employees[indenNum].getSalary() + (employees[indenNum].getSalary() * employees[indenNum].getBonusPoint())) * 12;
    }
}
