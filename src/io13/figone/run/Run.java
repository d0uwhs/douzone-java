package io13.figone.run;

import io13.figone.dao.FileDao;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileDao fileDao = new FileDao();

        while (true){
            System.out.printf("***** My Note *****\n" +
                    "1. 노트 새로 만들기\n" +
                    "2. 노트 열기\n" +
                    "3. 노트 열어서 수정하기\n" +
                    "4. 끝내기\n" +
                    "번호를 입력하세요 : ");
            String select = scanner.next();

            if (!(select.equals("1") || select.equals("2") || select.equals("3") || select.equals("4"))){
                System.out.println("잘못 입력하셨습니다.");
            }

            if (select.equals("4")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (select.equals("1")){
                fileDao.fileSave();
            }
            if (select.equals("2")){
                fileDao.fileOpen();
            }
            if (select.equals("3")){
                fileDao.fileEdit();
            }
        }
    }
}


