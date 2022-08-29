package api11.hw5.controller;

import java.util.Random;
import java.util.Scanner;

public class NumberOk {


    public NumberOk() {
    }

    public void numGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int randomNum = (int)(Math.random()*100+1);
            int i = 0;
            while (true) {
                i++;
                System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
                int inputNum = scanner.nextInt();

                if (randomNum < inputNum) {
                    System.out.println(inputNum + "보다 작습니다. " + i + "번쨰 실패!");
                }
                if (randomNum > inputNum) {
                    System.out.println(inputNum + "보다 큽니다. " + i + "번쨰 실패!");
                }

                if (randomNum == inputNum){
                    System.out.println("정답입니다." + i + "번만에 맞췄습니다.");
                    while (true){
                        System.out.println("계속 하시겠습니까?(y/n)");
                        String input = scanner.nextLine();

                        if (input.equalsIgnoreCase("Y")){
                            System.out.println("새로운 게임을 시작합니다.");
                            break;
                        }

                        if (input.equalsIgnoreCase("N")){
                            System.out.println("게임을 종료합니다.");
                            System.exit(1);
                        }

                        if (!input.equalsIgnoreCase("Y")){
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        }
                    }
                }
            }
        }
    }
}
