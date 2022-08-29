package api11.hw1.view;

import api11.hw1.controller.TokenController;

import java.util.Scanner;

public class TokenView {
    private Scanner scanner = new Scanner(System.in);
    TokenController tokenController = new TokenController();

    public void mainMenu(){
        while (true){
            System.out.print("1. 지정 문자열\n" +
                    "2. 입력 문자열\n" +
                    "9. 프로그램 끝내기\n" +
                    "메뉴 번호 : ");
            String select = scanner.nextLine();


            if (select.equals("1")){
                tokenMenu();
            }
            if (select.equals("2")){
                inputMenu();
            }
            if (select.equals("9")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (!(select.equals("1") || select.equals("2") || select.equals("9"))) {
                System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
    public void tokenMenu(){
        String str = "J a v a P r o g r a m";
        String returnStr = tokenController.afterToken(str);
        System.out.println("토큰 처리 전 글자 : " + str);
        System.out.println("토큰 처리 전 개수 : " + str.length());
        System.out.println("토큰 처리 후 글자 : " + returnStr);
        System.out.println("토큰 처리 후 개수 : " + returnStr.length());
        System.out.println("모두 대문자로 변환 : " + returnStr.toUpperCase());

    }
    public void inputMenu(){
        System.out.println("문자열을 입력하세요 : ");
        String input = scanner.nextLine();
        System.out.println("첫글자 대문자 : " + tokenController.firstCap(input));
        System.out.println("찾을 문자열을 하나 입력하세요 : ");
        char find = scanner.nextLine().charAt(0);
        int result = tokenController.findChar(input,find);
        System.out.println(find + "문자가 들어간 갯수 : " + result);
    }
}
