package org.example.CompanyFactory;

import org.example.CarFactory.Car;

public interface Company {
    Car buildOffroadCar();
    Car buildLuxuryCar();
    Car buildSuvCar();

}
