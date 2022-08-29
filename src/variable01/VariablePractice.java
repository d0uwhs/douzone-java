package variable01;

import java.util.Scanner;

public class VariablePractice {
    /**
     * Scanner에는 char 타입 메서드가 없음.
     * char 타입 형변환 하거나, 분기문 예외처리함.
     */
    public void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String inputName = sc.next();
        System.out.print("나이를 입력하세요 : ");
        int inputAge = sc.nextInt();
        String inputGender = "";
        boolean isRightGendered = true;
        while (isRightGendered) {
            System.out.print("성별을 입력하세요(남/여) : ");
            inputGender = sc.next();
            if (inputGender.equals("남") || inputGender.equals("여")) {
                isRightGendered = false;
            } else {
                System.out.println("성별이 잘못되었습니다.");
            }
        }
        System.out.print("키를 입력하세요.(cm) : ");
        double inputHeight = sc.nextDouble();
        System.out.printf("키%.1f인 %d살 %s자 %s님 반갑습니다 ^^", inputHeight, inputAge, inputGender, inputName);
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int firstInput = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int secondInput = sc.nextInt();
        System.out.printf("더하기 결과 : %d\n", (firstInput + secondInput));
        System.out.printf("빼기 결과 : %d\n", (firstInput - secondInput));
        System.out.printf("곱하기 결과 : %d\n", (firstInput * secondInput));
        System.out.printf("나누기 결과 : %.3f\n", ((double) firstInput / (double) secondInput));
    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        float firstInput = sc.nextFloat();
        System.out.print("세로 : ");
        float secondInput = sc.nextFloat();
        System.out.printf("면적 : %.3f\n", (firstInput * secondInput));
        System.out.printf("둘레 : %.3f\n", (firstInput + secondInput) * 2);

    }

    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String firstInput = sc.next();
        System.out.printf("첫 번째 문자 : %s\n",firstInput.charAt(0));
        System.out.printf("첫 번째 문자 : %s\n",firstInput.charAt(1));
        System.out.printf("첫 번째 문자 : %s\n",firstInput.charAt(2));

    }
}
