package array06.array.level04.advanced;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        int count = 10;

        SecureRandom secureRandom = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        int[] randomNumber = new int[4];

        // 랜덤 번호 생성
        for (int i = 0; i < randomNumber.length; i++) {
            int num = secureRandom.nextInt(9);
            randomNumber[i] = num;
            for (int j = 0; j < i; j++) {
                if (randomNumber[i] == randomNumber[j]) {
                    i--;
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(randomNumber));

        while (count != 0) {
            int strike = 0;
            int ball = 0;
            // 입력
            String inputAnswer = getInputAnswer(count, scanner);
            // 오류
            outOfBound(inputAnswer);
            // array 생성
            int[] inputArray = getArray(inputAnswer);
            for (int i = 0; i < randomNumber.length; i++) {
                    for (int j = 0; j< randomNumber.length; j++){
                        if(inputArray[i] == randomNumber[j]){
                            if(i == j){
                                strike++;
                            } else {
                                ball++;
                            }
                        }

                }
            }
            // 오답 및 검증
            count = incorrect(count, strike, ball, inputAnswer);

            //정답
            if (strike == 4) {
                System.out.println("정답입니다.");
                return;
            }
        }
        System.out.println("프로그램을 종료합니다.");

        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         * 1307
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
    }

    private static int incorrect(int count, int strike, int ball, String inputAnswer) {
        if (!(strike == 4) && !(ball == 4) && (inputAnswer.length() == 4)) {
            System.out.printf("아쉽네요. %dS %dB 입니다.\n", strike, ball);
            count--;
        }
        return count;
    }

    private static void outOfBound(String inputAnswer) {
        if (inputAnswer.length() > 4) {
            System.out.println("4자리의 정수를 입력해야 합니다.");
        }
    }

    private static String getInputAnswer(int count, Scanner scanner) {
        System.out.printf("남은 횟수 : %d\n", count);
        System.out.print("숫자를 입력하세요 : ");
        String inputAnswer = scanner.next();
        return inputAnswer;
    }

    private static int[] getArray(String inputAnswer) {
        int[] inputArray = new int[4];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(inputAnswer.substring(i, i + 1));
        }
        return inputArray;
    }
}

