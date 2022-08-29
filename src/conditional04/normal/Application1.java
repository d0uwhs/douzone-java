package conditional04.normal;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1~10 사이 정수를 입력하세요.");
			int oddNumChecker = sc.nextInt();
			if (isValid(oddNumChecker)){
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				if (oddNumChecker % 2 == 0){
					System.out.println("짝수다");
					break;
				} else {
					System.out.println("홀수다");
					break;
				}
			}
		}
		
		/* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
		 * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
		 * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요. 
		 * */
		
	}

	private static boolean isValid(int oddNumChecker) {
		return oddNumChecker > 10;
	}
}
