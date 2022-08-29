package array06.array.level04.advanced;

import java.security.SecureRandom;

public class Application1 {

	public static void main(String[] args) {
		/**
		 * Secure Random : https://kdhyo98.tistory.com/48
		 */
		SecureRandom secureRandom = new SecureRandom();
		int[]lotto = new int[6];
		// 랜덤 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			int num = secureRandom.nextInt(44)+1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]){
					i--;
					break;
				}
			}
		}
		// 버블정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length ; j++) {
				if(lotto[i]>lotto[j]){
					int changeTo = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = changeTo;
				}
			}
		}
		for (int i :
				lotto) {
			System.out.println(i);
		}
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		
	}
}
