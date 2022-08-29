package array06.demensional_array.level04.advanced;

public class Application1 {

    public static void main(String[] args) {
        String[][] students = new String[3][4];
        students[0] = new String[]{"홍길동", "80", "90", "77"};
        students[1] = new String[]{"이순신", "78", "97", "86"};
        students[2] = new String[]{"유관순", "71", "68", "88"};
        int studentTotalScores = 0;
        int studentsTotalScores = 0;

        System.out.print("* ====================================== A반 성적표 ======================================\n" +
                "* 이름            국어            영어            수학            합계            평균\n" +
                "* ========================================================================================\n");

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (j > 0) {
                    studentTotalScores += Integer.parseInt(students[i][j]);
                }
                System.out.print(students[i][j] + " ");
            }
            System.out.print(studentTotalScores + " " + studentTotalScores / (double) (students[i].length - 1)+"\n");
            studentTotalScores = 0;
        }
        System.out.print("* ========================================================================================\n합계 ");
        for (int i = 1; i <= students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                studentTotalScores += Integer.parseInt(students[j][i]);
                if (j == students.length - 1) {
                    studentsTotalScores += studentTotalScores;
                    System.out.print(studentTotalScores + " ");
                }
            }
            studentTotalScores = 0;
        }
        System.out.print(studentsTotalScores + " " + (double) studentsTotalScores / (students.length * 3));
    }
}



/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
 *
 * -- 출력 예시 --
 * ================== A반 성적표 ====================
 * 이름        국어          영어          수학          합계            평균
 * -----------------------------------------------
 * 홍길동       80      90       77      247     82.3
 * 이순신       78      97       86      261     87.0
 * 유관순       71      68       88      227     75.7
 * -----------------------------------------------
 * 합계        229     255      251      735     81.7
 * */
