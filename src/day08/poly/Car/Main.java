package day08.poly.Car;

import day07.static_.Utility;

import static day07.static_.Utility.*;

public class Main {
    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Tucson());

        makeLine();

        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();

        makeLine();

        // 타입을 내릴때는 (내린타입)으로 묶어줘야(캐스팅)함.
        // Car car = shop.exportCar(6000);
        // 타입도 해당타입에 맞게 캐스팅 해주어야 함.
        Mustang car = (Mustang) shop.exportCar(6000);

//        //캐스팅을 알아보는 타입을 알아보는 instanceof
//        System.out.println(car instanceof Stinger);
//        System.out.println(car instanceof Tucson);
//        System.out.println(car instanceof Mustang);


        System.out.println("car =" + car);
        car.powerSound();



    }
}
