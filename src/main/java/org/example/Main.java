package org.example;

import org.example.CarFactory.Car;
import org.example.CompanyFactory.Company;
import org.example.CompanyFactory.CompanyFactoryImplementation.Bmw;
import org.example.CompanyFactory.CompanyFactoryImplementation.Chevrolet;
import org.example.CompanyFactory.CompanyFactoryImplementation.Ford;

public class Main {
    public static void main(String[] args) {
        Company bmw = new Bmw();
        Company chevy = new Chevrolet();
        Company ford = new Ford();
        //BMW
        Car bmwOffroad = bmw.buildOffroadCar();
        Car bmwLuxury = bmw.buildLuxuryCar();
        Car bmwSuv = bmw.buildSuvCar();
        //Chevrolet
        Car chevyOffroad = chevy.buildOffroadCar();
        Car chevyLuxury = chevy.buildLuxuryCar();
        Car chevySuv = chevy.buildSuvCar();
        //Ford
        Car fordOffroad = ford.buildOffroadCar();
        Car fordLuxury = ford.buildLuxuryCar();
        Car fordSuv = ford.buildSuvCar();

        bmwOffroad.drive();
        bmwOffroad.selfDestruct();
        System.out.println("\n");
        bmwLuxury.drive();
        bmwLuxury.selfDestruct();
        System.out.println("\n");
        bmwSuv.drive();
        bmwSuv.selfDestruct();
        System.out.println("===========================================");

        chevyOffroad.drive();
        chevyOffroad.selfDestruct();
        System.out.println("\n");
        chevyLuxury.drive();
        chevyLuxury.selfDestruct();
        System.out.println("\n");
        chevySuv.drive();
        chevySuv.selfDestruct();
        System.out.println("===========================================");

        fordOffroad.drive();
        fordOffroad.selfDestruct();
        System.out.println("\n");
        fordLuxury.drive();
        fordLuxury.selfDestruct();
        System.out.println("\n");
        fordSuv.drive();
        fordSuv.selfDestruct();
        System.out.println("===========================================");
    }
}