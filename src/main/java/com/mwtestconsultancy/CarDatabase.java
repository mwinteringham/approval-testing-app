package com.mwtestconsultancy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarDatabase {

    private List<CarModel> cars;
    private int toggle = 0;

    public CarDatabase() {
        CarModel carOne = new CarModel("Ford", "Focus", 20000, LocalDate.of(2018, 01, 01), "./focus.jpg");
        CarModel carTwo = new CarModel("Toyota", "Auris", 28000, LocalDate.of(2017, 03, 21), "./auris.jpg");

        cars = new ArrayList<>();
        cars.add(carOne);
        cars.add(carTwo);
    }

    public CarModel getCurrentCar() {
        return cars.get(toggle);
    }

    public void switchCars() {
        if(toggle == 0){
            toggle = 1;
        } else {
            toggle = 0;
        }
    }
}
