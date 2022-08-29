package api11.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
    public String afterToken(String str){
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreTokens()){
            stringBuilder.append(stringTokenizer.nextToken());
        }
        return stringBuilder.toString();
    }
    public String firstCap(String input){
        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
    public int findChar(String input, char one){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == one){
                count++;
            }
        }
        return count;

    }
}
