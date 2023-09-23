package org.example.CarFactory.CarFactoryImplementation;

import org.example.CarFactory.Car;

public class OffroadCar implements Car {
    private String company;

    public OffroadCar(String company) {
        this.company = company;
    }

    @Override
    public void drive() {
        System.out.println(this.company + "'s off-road car is driving...");
    }

    @Override
    public void selfDestruct() {
        System.out.println(this.company + "'s off-road car will be self-destructed in 3 2 1...");
    }
}
