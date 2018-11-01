package com.ssnit.session12;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(CarType.Honda);
        CarType[] carTypes = CarType.values();

        for (CarType carType: carTypes) {
            System.out.println(carType);
        }
    }
}
