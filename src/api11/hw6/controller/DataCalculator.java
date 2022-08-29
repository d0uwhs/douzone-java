package api11.hw6.controller;

import java.util.Calendar;

public class DataCalculator {
    public DataCalculator() {
    }
    public long leapDate(){
        Calendar today = Calendar.getInstance();
        long sumDays = 0L;

        for(int i = 1; i <= today.get(1); ++i) {
            if (i != today.get(1)) {
                if (this.isLeapYear(i)) {
                    sumDays += 366L;
                } else {
                    sumDays += 365L;
                }
            } else {
                if (this.isLeapYear(i)) {
                    System.out.println("올해는 윤년입니다.");
                } else {
                    System.out.println("올해는 평년입니다.");
                }

                for(int j = 1; j <= today.get(2) + 1; ++j) {
                    if (j == today.get(2) + 1) {
                        for(int n = 1; n <= today.get(5); ++n) {
                            ++sumDays;
                        }
                    } else if (j == 2) {
                        if (this.isLeapYear(i)) {
                            sumDays += 29L;
                        } else {
                            sumDays += 28L;
                        }
                    } else if (j != 4 && j != 6 && j != 9 && j != 11) {
                        sumDays += 31L;
                    } else {
                        sumDays += 30L;
                    }
                }
            }
        }

        return sumDays;
    }

    public boolean isLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            return true;
        } else return false;
    }
}
