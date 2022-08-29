package conditional04.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키 :");
		int height = sc.nextInt();
		double heightToMeter = (double) height/100;
		System.out.println(heightToMeter);
		System.out.print("몸무게 :");
		int weight = sc.nextInt();
		double bmi = weight / (heightToMeter * heightToMeter);

		if (isLow(bmi)){
			System.out.println(bmi);
			System.out.println("당신은 저체중 입니다.");
		}

		if (isNormal(bmi)){
			System.out.println(bmi);
			System.out.println("당신은 정상체중 입니다.");
		}

		if (isOver(bmi)){
			System.out.println(bmi);
			System.out.println("당신은 과체중입니다.");
		}

		if (isFullyOver(bmi)) {
			System.out.println(bmi);
			System.out.println("당신은 비만입니다.");
		}
		
		/* BMI(신체질량지수)를 계산하고, 계산된 값에 따라 
		 * 저체중(20 미만)인 경우 "당신은 저체중 입니다.", 
		 * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.", 
		 * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.", 
		 * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
		 * 
		 * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
		 * 
		 * 계산 예시) BMI = 67 / (1.7 * 1.7)
		 * */
		
	}

	private static boolean isLow(double bmi) {
		return bmi < 20;
	}

	private static boolean isFullyOver(double bmi) {
		return bmi > 30;
	}

	private static boolean isOver(double bmi) {
		return bmi >= 25 && bmi < 30;
	}

	private static boolean isNormal(double bmi) {
		return bmi >= 20 && bmi < 25;
	}
}
