package polymorphism10.hw1.run;

import polymorphism10.hw1.model.dto.GalaxyNote9;
import polymorphism10.hw1.model.dto.SmartPhone;
import polymorphism10.hw1.model.dto.V40;

public class Run {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = new SmartPhone[2];

        smartPhones[0] = new GalaxyNote9();
        smartPhones[1] = new V40();

        for (SmartPhone smartPhone : smartPhones){
            smartPhone.printMaker();
            smartPhone.makeACall();
            smartPhone.takeACall();
            smartPhone.touch();
            smartPhone.charge();
            smartPhone.picture();

        }
    }
}
