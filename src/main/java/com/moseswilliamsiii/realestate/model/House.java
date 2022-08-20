package com.moseswilliamsiii.realestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class House {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "street_number")
    private int streetNumber;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "apartment_number")
    private String apartmentNumber;

    @Column(name = "environment")
    private String environment;

    public House() {
    }

    public House(String id, String streetName, int streetNumber, String cityName, String apartmentNumber) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
        this.apartmentNumber = apartmentNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
