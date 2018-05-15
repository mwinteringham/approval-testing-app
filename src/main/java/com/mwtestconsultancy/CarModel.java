package com.mwtestconsultancy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarModel {

    @JsonProperty
    private String company;
    @JsonProperty
    private String make;
    @JsonProperty
    private int price;
    @JsonProperty
    private LocalDate datePurchased;
    @JsonProperty
    private String image;

    public CarModel(String company, String make, int price, LocalDate datePurchased, String image) {
        this.company = company;
        this.make = make;
        this.price = price;
        this.datePurchased = datePurchased;
        this.image = image;
    }

    public CarModel() {
    }

    public String getCompany() {
        return company;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public String getDatePurchased() {
        return DateTimeFormatter.ISO_DATE.format(datePurchased);
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "company='" + company + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", datePurchased=" + datePurchased +
                ", image='" + image + '\'' +
                '}';
    }
}
