package com.enigma.model;

import java.util.Objects;

public class Car {

    private String licensePlate;
    private Integer timeEntry;

    Car(String licenseplate, Integer timeEntry ){
        this.licensePlate = licenseplate;
        this.timeEntry = timeEntry;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }

    public Integer getTimeEntry() {
        return this.timeEntry;
    }
}
