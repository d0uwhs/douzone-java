package api11.hw3.run;

import api11.hw3.controller.SetDate;

public class Run {
    public static void main(String[] args) {
        SetDate setDate = new SetDate();
        System.out.println(setDate.todayPrint());
        System.out.println(setDate.setDay());
    }
}
