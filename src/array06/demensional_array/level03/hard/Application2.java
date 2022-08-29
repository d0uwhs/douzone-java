package array06.demensional_array.level03.hard;

import java.util.Scanner;

public class Application2 {
    static int input;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("홀수 하나를 입력하세요.");
            input = scanner.nextInt();
            if (input % 2 == 0) {
                System.out.println("홀수만 입력해야 합니다.");
            }
            if (input % 2 != 0) {
                break;
            }
        }
        String[][] square = new String[input][input];
        int minNum = 0;
        int maxNum = input - 1;
        for (int i = 0; i < input; i++) {
            int min = Math.min(minNum, maxNum);
            int max = Math.max(minNum, maxNum);
            for (int j = 0; j < input; j++) {
                if (j >= min && j <= max) {
                    square[i][j] = "*";
                } else square[i][j] = " ";
            }
            minNum++;
            maxNum--;
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }



        /* 홀수를 하나 입력 받아 입력받은 크기 만큼의 정사각형 형태의 2차원 배열을 할당하고
         * 모래시계 모양으로 *을 출력하세요
         *
         * -- 입력 예시 --
         * 홀수 하나를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * *****
         *  ***
         *   *
         *  ***
         * *****
         *
         * 단, 홀수를 입력하지 않은 경우 "홀수만 입력해야 합니다." 출력
         * */

    }
}
