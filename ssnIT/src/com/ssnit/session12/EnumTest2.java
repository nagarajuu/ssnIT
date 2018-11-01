package com.ssnit.session12;

public class EnumTest2 {
    public static void main(String[] args) {
        CarType carTypeHonda = CarType.Honda;
        System.out.println(carTypeHonda.getPrice());
        System.out.println(CarType.valueOf("Honda"));

    }
}
