package object07.level04.advanced.shape.manager;

import object07.level04.advanced.shape.model.dto.ShapeDto;

import java.util.Scanner;

public class TriangleManager {
    public void calcPerimeter(ShapeDto shapeDto) {
        // 삼각형의 둘레 구하기
        double pythagoras = Math.pow(shapeDto.getWidth(),2) + Math.pow(shapeDto.getHeight(),2);
        double getHypotenuse = Math.sqrt(pythagoras);
        String getPerimeter = String.valueOf( shapeDto.getWidth() + shapeDto.getHeight() + getHypotenuse);
        System.out.printf("삼각형의 둘레는 %s 입니다.\n", getPerimeter);
    }

    public void calcArea(ShapeDto shapeDto) {
        // 삼각형의 면적 구하기
        String getArea = String.valueOf(shapeDto.getHeight() * shapeDto.getWidth() / 2);
        System.out.printf("삼각형의 면적은는 %s 입니다.\n", getArea);

    }

    public void printShape(ShapeDto shapeDto) {
        String typeChecker = "";
        if (shapeDto.getType() == 3) {
            typeChecker = "삼각형";
        }
        System.out.println("도형 타입 : " + typeChecker);
        System.out.println("높이 : " + shapeDto.getWidth());
        System.out.println("너비 : " + shapeDto.getHeight());
        System.out.println("색상 : " + shapeDto.getColor());

    }

    public void paintColor(ShapeDto shapeDto, String colorName) {
        shapeDto.setColor(colorName);
        // 첫번째 매개변수 : 도형
        // 두번째 색상
        // Dto 객체 색상 변경
    }
}
