package org.example.CompanyFactory.CompanyFactoryImplementation;

import org.example.CarFactory.Car;
import org.example.CarFactory.CarFactoryImplementation.LuxuryCar;
import org.example.CarFactory.CarFactoryImplementation.OffroadCar;
import org.example.CarFactory.CarFactoryImplementation.SuvCar;
import org.example.CompanyFactory.Company;

public class Bmw implements Company {
    @Override
    public Car buildOffroadCar() {
        return new OffroadCar("BMW");
    }

    @Override
    public Car buildLuxuryCar() {
        return new LuxuryCar("BMW");
    }

    @Override
    public Car buildSuvCar() {
        return new SuvCar("BMW");
    }
}
