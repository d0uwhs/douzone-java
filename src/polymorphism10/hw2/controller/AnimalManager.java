package polymorphism10.hw2.controller;

import polymorphism10.hw2.model.dto.Animal;
import polymorphism10.hw2.model.dto.Cat;
import polymorphism10.hw2.model.dto.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("디디","페르시안 믹스묘","페르시안","골드");
        animals[1] = new Dog("보통이","믹스",5);
        animals[2] = new Cat("티티","브리티쉬 숏헤어 믹스","영국","올리브");
        animals[3] = new Dog("뭉자","푸들",3);
        animals[4] = new Cat("코코","스코티쉬 스트레이트 믹스","스페인","밝은 하늘");

        for(Animal animal :animals){
            animal.speak();
        }
    }
}
