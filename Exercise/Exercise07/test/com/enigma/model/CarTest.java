package com.enigma.model;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void assertTrue_When_LicensePlate_equals_B76877PZ(){
        String licensePlate = "B 4567 S7C";
        Car carTest = new Car(licensePlate, 1);
        assertEquals(licensePlate,carTest.getLicensePlate());
    }

    @Test
    public void assertFalse_When_LicensePlate_equals_B768FFFF_filled_with_B76877PZ(){
        String licensePlate = "B 4567 S7C";
        String wrongLicensePlate = "B 4567 S8C";
        Car carTest = new Car(licensePlate, 1);
        assertFalse(carTest.getLicensePlate().equals(wrongLicensePlate));
    }



}