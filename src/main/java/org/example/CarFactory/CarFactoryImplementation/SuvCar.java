package org.example.CarFactory.CarFactoryImplementation;

import org.example.CarFactory.Car;

public class SuvCar implements Car {
    private String company;

    public SuvCar(String company) {
        this.company = company;
    }

    @Override
    public void drive() {
        System.out.println(this.company + "'s suv car is driving...");
    }

    @Override
    public void selfDestruct() {
        System.out.println(this.company + "'s suv car will be self-destructed in 3 2 1...");
    }
}
