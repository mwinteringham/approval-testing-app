package com.mwtestconsultancy;

import io.restassured.response.Response;
import org.approvaltests.Approvals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static io.restassured.RestAssured.given;

public class CarApiIT {

    private ApplicationContext app;

    @Before
    public void setupApi(){
        app = SpringApplication.run(CarApi.class);
    }

    @After
    public void killApi(){
        SpringApplication.exit(app);
    }

    @Test
    public void testGetCar(){
        Response carResponse = given()
                                .get("http://localhost:8080/car");

        Approvals.verify(carResponse.getBody().print());
    }

    @Test
    public void testToggleCar(){
        Response toggleResponse = given()
                                    .post("http://localhost:8080/toggle");

        Approvals.verify(toggleResponse.getStatusCode());
    }

    @Test
    public void testToggleCarSendsNewPayload(){
        Response toggleResponse = given()
                .post("http://localhost:8080/toggle");

        Response carResponse = given()
                .get("http://localhost:8080/car");

        Approvals.verify(carResponse.getBody().print());
    }

}
