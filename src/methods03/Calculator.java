package methods03;

public class Calculator {
    public void checkMethod(){
        System.out.println("함수 호출 확인용 메소드");
    }

    public int sub1to10(){
        int result = 0;
        for (int i = 0; i <= 10; i++) {
            result += i;
        }
        return result;
    }

    public void checkMaxNumber(int a, int b){
        System.out.println("두 수 중 큰 수는 " + (a > b ? a : b) + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusToNumber(int a, int b){
        return a - b;
    }


}
