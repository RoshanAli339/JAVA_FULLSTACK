package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle {
    @Override
    public String getModelName() {
        return "Logan Latest Model";
    }

    @Override
    public String getOwnerName() {
        return "Owner3";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP34EF7890";
    }

    public int speed(){
        return 100;
    }

    public int gps(){
        System.out.println("Control GPS");
        return 0;
    }
}
