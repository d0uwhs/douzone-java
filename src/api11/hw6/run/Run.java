package api11.hw6.run;

import api11.hw6.controller.DataCalculator;

public class Run {
    public static void main(String[] args) {
        DataCalculator dataCalculator = new DataCalculator();
        if (dataCalculator.isLeapYear(2022)){
            System.out.println("올해는 평년입니다.");
        } else {
            System.out.println();
        }
        System.out.println("총 날짜수 : " + dataCalculator.leapDate());
    }
}
