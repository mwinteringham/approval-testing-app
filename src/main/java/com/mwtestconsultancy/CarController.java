package com.mwtestconsultancy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private CarDatabase carDatabase;

    public CarController() {
        carDatabase = new CarDatabase();
    }

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ResponseEntity<CarModel> getCar() {
        return ResponseEntity.ok(carDatabase.getCurrentCar());
    }

    @RequestMapping(value = "/toggle", method = RequestMethod.POST)
    public ResponseEntity switchCars(){
        carDatabase.switchCars();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ResponseEntity<InfoModel> returnStatus(){
        return ResponseEntity.ok(new InfoModel());
    }

}
