package api11.hw3.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SetDate {
    public SetDate() {
    }
    public String todayPrint(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 MM분 SS초"));
    }
    public String setDay(){
        LocalDate localDate = LocalDate.of(2011,03,21);
        return localDate.getYear() + "년 " + localDate.getMonthValue() + "월 " + localDate.getDayOfMonth() + "일 " + localDate.getDayOfWeek();
    }
}
