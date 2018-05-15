package com.mwtestconsultancy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CarDatabase {

    private List<CarModel> cars;
    private int toggle = 0;

    public CarDatabase() {
        CarModel carOne = new CarModel("Ford", "Focus", 20000, LocalDate.now(), "https://upload.wikimedia.org/wikipedia/commons/0/09/2017_Ford_Focus_Zetec_Edition_1.0_Front.jpg");
        CarModel carTwo = new CarModel("Toyota", "Auris", 28000, LocalDate.now().minus(5, ChronoUnit.MONTHS), "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/2016_Toyota_Corolla_%28ZRE182R%29_Ascent_Sport_hatchback_%282017-01-30%29_01.jpg/1600px-2016_Toyota_Corolla_%28ZRE182R%29_Ascent_Sport_hatchback_%282017-01-30%29_01.jpg");

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
