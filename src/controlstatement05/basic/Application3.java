package controlstatement05.basic;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int targetValue = sc.nextInt();
		int result = 0;
		for (int i = 0; i <= targetValue; i++) {
			if (i % 2 != 0){
				continue;
			}
			result += i;
		}
		System.out.println("1부터 " + targetValue + "의 짝수의 합 : " + result);
		/* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 10
		 * 
		 * -- 출력 예시 --
		 * 1부터 10까지 짝수의 합 : 30
		 * */
		
	}

}
