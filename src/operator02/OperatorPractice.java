package operator02;

import java.util.Scanner;

public class OperatorPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int input = sc.nextInt();
        String result = (input > 0) ? "양수다" : "양수가 아니다";
        System.out.println(result);
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int input = sc.nextInt();
        String result = (input > 0) ? "양수다" : ((input == 0) ? "0이다" : "음수다");
        System.out.println(result);
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int input = sc.nextInt();
        String result = (input % 2 == 0) ? "짝수다" : "홀수다";
        System.out.println(result);
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수 : ");
        int firstInput = sc.nextInt();
        System.out.print("사탕 수 : ");
        int secondInput = sc.nextInt();
        System.out.printf("1인당 사탕 개수 : %d\n", (secondInput / firstInput));
        System.out.printf("1인당 사탕 개수 : %d\n", (secondInput % firstInput));
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String a = sc.next();
        System.out.print("학년(숫자만): ");
        int b = sc.nextInt();
        System.out.print("반(숫자만): ");
        int c = sc.nextInt();
        System.out.print("번호(숫자만): ");
        int d = sc.nextInt();
        System.out.print("성별(M/F): ");
        String e = sc.next();
        System.out.print("성적(소수점 아래 둘째 자리까지): ");
        double f = sc.nextDouble();
        String g = (e.equals("M") ? "남" : "여");
        System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", b, c, d, a, g, f);

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int a = sc.nextInt();
        String result = (a <= 13 ? "어린이" : ((a > 13 && a <= 19 ? "청소년" : "성인")));
        System.out.println(result);

    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int firstInput = sc.nextInt();
        System.out.print("영어 : ");
        int secondInput = sc.nextInt();
        System.out.print("수학 : ");
        int thirdInput = sc.nextInt();

        int totalScore = firstInput + secondInput + thirdInput;
        double averageScore = (firstInput + secondInput + thirdInput) / 3;

        System.out.printf("합계 : %d\n", totalScore);
        System.out.printf("평균 : %.1f\n", averageScore);
        System.out.println(((firstInput >= 40) && (secondInput >= 40) && (thirdInput >= 40)) && (averageScore >= 60) ? "합격" : "불합격");

    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        String id = sc.next();
        System.out.println(id.charAt(7) == '2' ? "여자" : "남자");

    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력 : ");
        int num3 = sc.nextInt();

        System.out.println(((num1 >= num3) || (num2 < num3))?true:false);

    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력1 : ");
        int num1 = sc.nextInt();
        System.out.print("입력2 : ");
        int num2 = sc.nextInt();
        System.out.print("입력3 : ");
        int num3 = sc.nextInt();

        System.out.println(((num1==num2)&& (num2==num3) && (num3==num1))?true:false);

    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A사원의 연봉: ");
        double a = sc.nextDouble();
        System.out.print("B사원의 연봉: ");
        double b = sc.nextDouble();
        System.out.print("C사원의 연봉: ");
        double c = sc.nextDouble();

        double aIns = 0.4;
        double bIns = 0;
        double cIns = 0.15;

        double aSal = a + (a * aIns);
        double bSal = b + (b * bIns);
        double cSal = c + (c * cIns);

        System.out.printf("A사원의 인센티브포함 연봉 : %.1f\n", (aSal));
        String aRes = (aSal >= 3000 ? "3000 이상" : "3000미만");
        System.out.println(aSal >= 3000 ? "3000 이상" : "3000 미만");
        System.out.printf("B사원의 인센티브포함 연봉 : %.1f\n", (bSal));
        System.out.println(bSal >= 3000 ? "3000 이상" : "3000 미만");
        System.out.printf("C사원의 인센티브포함 연봉 : %.9f\n", (cSal));
        System.out.println(cSal >= 3000 ? "3000 이상" : "3000 미만");
    }
}

