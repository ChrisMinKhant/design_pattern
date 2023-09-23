package org.example.CompanyFactory.CompanyFactoryImplementation;

import org.example.CarFactory.Car;
import org.example.CarFactory.CarFactoryImplementation.LuxuryCar;
import org.example.CarFactory.CarFactoryImplementation.OffroadCar;
import org.example.CarFactory.CarFactoryImplementation.SuvCar;
import org.example.CompanyFactory.Company;

public class Ford implements Company {
    @Override
    public Car buildOffroadCar() {
        return new OffroadCar("Ford");
    }

    @Override
    public Car buildLuxuryCar() {
        return new LuxuryCar("Ford");
    }

    @Override
    public Car buildSuvCar() {
        return new SuvCar("Ford");
    }
}
