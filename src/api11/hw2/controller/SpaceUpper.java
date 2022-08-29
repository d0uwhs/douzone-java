package api11.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
    public SpaceUpper() {
    }

    public void spaceToUpper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            System.out.print(token.substring(0,1).toUpperCase() + token.substring(1) + " ");
        }

    }
}
