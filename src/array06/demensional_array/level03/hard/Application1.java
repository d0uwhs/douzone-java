package array06.demensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {
    static String[] list = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
    static int count = 0;
	static int findTable = 0;
	static int findRow = 0;
	static int findDirection = 0;
	static String direction;
	static String row;

    public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : " );
		String findByUsername  = scanner.next();
		
        String[][] students1 = new String[3][2];
        String[][] students2 = new String[3][2];

        System.out.println("-- 출석부 --");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }


        System.out.println("-- 1분단 --");
        for (int i = 0; i < students1.length; i++) {
            for (int j = 0; j < students1[i].length; j++) {
                students1[i][j] = list[(count)];
                count++;
            }
        }

        for (int i = 0; i < students1.length; i++) {
            for (int j = 0; j < students1[i].length; j++) {
                System.out.print(students1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("-- 2분단 --");
        for (int i = 0; i < students2.length; i++) {
            for (int j = 0; j < students2[i].length; j++) {
                students2[i][j] = list[(count)];
                count++;
            }
        }
        for (int i = 0; i < students2.length; i++) {
            for (int j = 0; j < students2[i].length; j++) {
                System.out.print(students2[i][j] + " ");
            }
            System.out.println("");
        }


		for (int i = 0; i < students1.length; i++) {
			for (int j = 0; j < students1[i].length; j++) {
				if (students1[i][j].equals(findByUsername)){
					findTable = 1;
					findRow = i+1;
					findDirection = j;
				}
			}
		}

		for (int i = 0; i < students2.length; i++) {
			for (int j = 0; j < students2[i].length; j++) {
				if (students2[i][j].equals(findByUsername)){
					findTable = 2;
					findRow = i+1;
					findDirection = j;
				}
			}
		}

		if (findDirection == 1){
			direction =  "오른쪽";
		}
		if (findDirection == 0){
			direction =  "왼쪽";
		}

		if (findRow == 1){
			row =  "두";
		}
		if (findRow == 0){
			row =  "첫";
		}


		System.out.printf("검색하신 %s은(는) %d분단 %s 번째 줄 %s에 있습니다.",findByUsername,findTable,findRow,direction);

        /* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
         * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
         * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
         *
         * -- 출석부 --
         * 1. 홍길동
         * 2. 이순신
         * 3. 유관순
         * 4. 윤봉길
         * 5. 장영실
         * 6. 임꺽정
         * 7. 장보고
         * 8. 이태백
         * 9. 김정희
         * 10. 대조영
         * 11. 김유신
         * 12. 이사부
         *
         * -- 출력 예시 --
         * == 1분단 ==
         * 홍길동 이순신
         * 유관순 윤봉길
         * 장영실 임꺽정
         *
         * == 2분단 ==
         * 장보고 이태백
         * 김정희 대조영
         * 김유신 이사부
         *
         * 출력한 이후 학생 이름을 입력 받아 몇 분단 몇 번째 줄 왼쪽/오른쪽 에 위치하는지를 출력하세요
         *
         * -- 입력 예시 --
         * 검색할 학생 이름을 입력하세요 : 대조영
         * 검색하신 대조영은 2분단 두 번째 줄 오른쪽에 있습니다.
         */

    }
}
