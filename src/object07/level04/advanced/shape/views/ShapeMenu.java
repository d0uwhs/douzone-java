package object07.level04.advanced.shape.views;

import object07.level04.advanced.shape.manager.SquareManager;
import object07.level04.advanced.shape.manager.TriangleManager;
import object07.level04.advanced.shape.model.dto.ShapeDto;

import java.util.Scanner;

public class ShapeMenu {
    static int width;
    static int height;
    private static final Scanner SCANNER = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.printf("============ 도형계산기 ============\n" +
                    "3. 삼각형\n" +
                    "4. 사각형\n" +
                    "9. 프로그램 종료\n" +
                    "===================================\n" +
                    "계산하려는 도형을 선택하세요. : ");
            String selectNum = SCANNER.next();
            if (!(selectNum.equals("3") || selectNum.equals("4") || selectNum.equals("9"))) {
                System.out.println("계산 할 수 없는 도형입니다. 다시 입력하세요.");
                continue;
            }
            if (selectNum.equals("3")) {
                triangleMenu(shapeBuilder("3"));
            }
            if (selectNum.equals("4")) {
                squareMenu(shapeBuilder("4"));
            }
            if (selectNum.equals("9")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }

    private ShapeDto shapeBuilder(String type) {
        System.out.println("도형의 높이를 입력하세요. : ");
        height = SCANNER.nextInt();
        System.out.println("도형의 너비를 입력하세요. : ");
        width = SCANNER.nextInt();
        return new ShapeDto(Integer.parseInt(type), width, height);
    }

    public void triangleMenu(ShapeDto shapeDto) {
        TriangleManager triangleManager = new TriangleManager();
        while (true) {
            System.out.printf("============ 삼각형 계산기 ============\n" +
                    "1. 삼각형의 둘레 구하기\n" +
                    "2. 삼각형의 면접 구하기\n" +
                    "3. 선택한 도형 정보 출력하기 \n" +
                    "4. 도형의 색상 칠하기\n" +
                    "9. 메인으로 돌아가기\n" +
                    "===================================\n" +
                    "계산하려는 도형을 선택하세요. : ");
            String selectNum = SCANNER.next();
            if (!(selectNum.equals("1") || selectNum.equals("2") || selectNum.equals("3") || selectNum.equals("4") || selectNum.equals("9"))) {
                System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요.");
                continue;
            }
            if (selectNum.equals("1")) {
                triangleManager.calcPerimeter(shapeDto);
            }
            if (selectNum.equals("2")) {
                triangleManager.calcArea(shapeDto);
            }
            if (selectNum.equals("3")) {
                triangleManager.printShape(shapeDto);
            }
            if (selectNum.equals("4")) {
                triangleManager.paintColor(shapeDto, inputColor());
            }
            if (selectNum.equals("9")) {
                System.out.println("메인으로 돌아갑니다.");
                return;
            }
        }
    }

    public void squareMenu(ShapeDto shapeDto) {
        SquareManager squareManager = new SquareManager();
        while (true) {
            System.out.printf("============ 사각형 계산기 ============\n" +
                    "1. 사각형의 둘레 구하기\n" +
                    "2. 사각형의 면접 구하기\n" +
                    "3. 선택한 도형 정보 출력하기 \n" +
                    "4. 도형의 색상 칠하기\n" +
                    "9. 메인으로 돌아가기\n" +
                    "===================================\n" +
                    "계산하려는 도형을 선택하세요. : ");
            String selectNum = SCANNER.next();
            if (!(selectNum.equals("1") || selectNum.equals("2") || selectNum.equals("3") || selectNum.equals("4") || selectNum.equals("9"))) {
                System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요.");
                continue;
            }

            if (selectNum.equals("1")) {
                squareManager.calcPerimeter(shapeDto);
            }
            if (selectNum.equals("2")) {
                squareManager.calcArea(shapeDto);
            }
            if (selectNum.equals("3")) {
                squareManager.printShape(shapeDto);
            }
            if (selectNum.equals("4")) {
                squareManager.paintColor(shapeDto, inputColor());
            }
            if (selectNum.equals("9")) {
                System.out.println("메인으로 돌아갑니다.");
                return;
            }
        }

    }
    public String inputColor() {
        System.out.print("어떤 색으로 도형을 칠할까요? : ");
        String selectedColor = SCANNER.next();
        System.out.printf("선택하신 도형을 %s로 칠합니다. \n", selectedColor);
        return selectedColor;
    }
}
