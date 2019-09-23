package com.enigma.model;
import java.util.HashSet;
import java.util.Set;

public class ParkingArea {
    private Integer minTime = 0;
    private Integer maxTime = 0;
    private Integer maxSlot;

    Set<Car> carSlot = new HashSet<>();

    ParkingArea(Integer maxSlot){
        this.maxSlot = maxSlot;

    }

    public Integer countAvaibleSpace() {
        return maxSlot-carSlot.size();
    }

    public void entryCar(Car myCar) {
        carSlot.add(myCar);
    }

    public boolean isFull() {
        return maxSlot.equals(carSlot.size());
    }

    public boolean sameLicensePlate(Car plate) {
        return carSlot.contains(plate);
    }

    public void inTime(Integer minTime, Integer maxTime) {
        this.minTime = this.minTime + minTime;
        this.maxTime = this.maxTime + maxTime;
    }
    public boolean isTimeParking(Car myCar) {
        if(minTime> myCar.getTimeEntry() & myCar.getTimeEntry() < maxTime){
            return false;
        }else {
            return true;
        }
    }
}
