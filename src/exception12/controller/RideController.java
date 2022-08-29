package exception12.controller;

import exception12.model.dto.Guests;

import java.util.StringTokenizer;

import static exception12.model.dto.RollerCoaster.*;

public class RideController {
    public RideController() {
    }
    public void cutGuests(){
        Guests[] guests = new Guests[4];

        Guests[] onBoard = new Guests[PERMITNUMBER];

        guests[0] = new Guests("홍길동",17,'M',120.2);
        guests[1] = new Guests("유관순",20,'F',102.3);
        guests[2] = new Guests("김유신",23,'M',110.4);
        guests[3] = new Guests("김흥부",21,'M',112.5);
        try {
            int count = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i].getHeight() > CUTHEIGHT){
                    onBoard[count] = guests[i];
                    count++;
                }
            }
        } catch (Throwable e) {
            StringTokenizer stringTokenizer = new StringTokenizer(e.getMessage());
            stringTokenizer.nextToken();
            String errorIndex = stringTokenizer.nextToken();
            System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + errorIndex);
            /**
             * 위치상 여기가 맞지 않나?
             */
            System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요.");
        }
        finally {
            System.out.println("이번 차례 탑승 명단");
            int count = 0;
            for(Guests guest : onBoard){
                System.out.println(guest.toString());
                count++;
            }
            System.out.println("탑승자 요금 " + count*PRICE);
        }

    }
}
