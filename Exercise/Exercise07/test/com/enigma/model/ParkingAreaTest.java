package com.enigma.model;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParkingAreaTest {

    @Test
    public void countAvailableSpace_should_return1_when_noCarPark(){
    Integer maxSlot =1;
    ParkingArea park = new ParkingArea(maxSlot);
    assertEquals(maxSlot, park.countAvaibleSpace());
    }

    @Test
    public void countAvailableSpace_should_return2_when_noCarPark(){
        Integer maxSlot =2;
        ParkingArea park = new ParkingArea(maxSlot);
        assertEquals(maxSlot, park.countAvaibleSpace());
    }

    @Test
    public void countAvailableSpace_should_return_when_1CarPark(){
        Integer maxSlot =3;
        Integer expectedAvailableSpace =2;
        ParkingArea park = new ParkingArea(maxSlot);
        Car myCar = new Car("JH 78HK 766", 1);
        park.entryCar(myCar);
        assertEquals(expectedAvailableSpace, park.countAvaibleSpace());
    }

    @Test
    public void cantPark_when_the_parking_lot_is_stillThere(){
        Integer maxSlot = 2;
        boolean expectedAvilableSpace = false;
        ParkingArea park = new ParkingArea(maxSlot);
        Car myCar = new Car("JK J89K JKL", 1);
        park.entryCar(myCar);
        assertEquals(expectedAvilableSpace, park.isFull());
    }

    @Test
    public void cantPark_when_the_parking_lot_is_full(){
        Integer maxSlot = 2;
        boolean expectedAvilableSpace = true;
        ParkingArea park = new ParkingArea(maxSlot);
        Car myCar = new Car("JK J89K JKL", 1);
        Car myCar2 = new Car("GK 789H JKL", 1);
        park.entryCar(myCar);
        park.entryCar(myCar2);
        assertEquals(expectedAvilableSpace, park.isFull());
    }


    @Test
    public void should_true_when_licensePlatesame_cantParkingArea(){
        Integer maxSlot = 2;
        ParkingArea park = new ParkingArea(maxSlot);
        Car myCar = new Car("JK J89K JKL", 1);
        Car myCar2 = new Car("JK J89K JKL", 1);
        park.entryCar(myCar);
        assertEquals(true, park.sameLicensePlate(myCar2));
    }

    @Test
    public void should_true_when_time_is_7to21_notTimefFParking(){
        Integer minTime = 7;
        Integer maxTime = 21;
        Integer maximumSlot = 3;
        ParkingArea parkingArea = new ParkingArea(maximumSlot);
        Car myCar = new Car("T 111 MM", 1);
        parkingArea.inTime(minTime, maxTime);
        parkingArea.entryCar(myCar);
        Boolean cek = parkingArea.isTimeParking(myCar);
        System.out.println(cek ? "ANDA MASIH BISA PARKIR" : "TUTUP CUY!");
        Assert.assertEquals(false, cek);
    }

}