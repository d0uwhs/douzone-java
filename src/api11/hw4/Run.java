package api11.hw4;

import api11.hw4.controller.EmpTest;

public class Run {
    public static void main(String[] args) {
        EmpTest empTest = new EmpTest();

        empTest.setEmp();
        empTest.printEmp();
        empTest.nameSortPrint();
    }
}
