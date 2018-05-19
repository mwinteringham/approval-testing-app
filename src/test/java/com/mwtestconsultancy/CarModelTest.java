package com.mwtestconsultancy;

import org.approvaltests.Approvals;
import org.junit.Test;

import java.time.LocalDate;

public class CarModelTest {

    @Test
    public void testModel(){
        CarModel carModel = new CarModel("SEAT", "Ibiza", 4000, LocalDate.of(2018, 01, 01), "/link/to/car");

        Approvals.verify(carModel);
    }

    @Test
    public void testInitialToggleState(){
        CarDatabase carDatabase = new CarDatabase();
        CarModel carOne = carDatabase.getCurrentCar();

        Approvals.verify(carOne.toString());
    }

    @Test
    public void testTogglingState(){
        CarDatabase carDatabase = new CarDatabase();
        carDatabase.switchCars();
        CarModel carTwo = carDatabase.getCurrentCar();

        Approvals.verify(carTwo);
    }

}
