package yongggguk.study.oop;

import yongggguk.study.oop.CarFactory.CarEncapsulation;
import yongggguk.study.oop.CarFactory.CarNoEncapsulation;

public class oopMain {
    public static void main(String args[]){
        CarEncapsulation Car = new CarEncapsulation();
        CarNoEncapsulation Car2 = new CarNoEncapsulation();

        Car.setCarName("benz");
        System.out.println(Car.getCarName());
        Car2.CarName = "test";
        System.out.println(Car2.CarName);
    }
}
