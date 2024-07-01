package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle {
    @Override
    public String getModelName() {
        return "Ford Latest Model";
    }

    @Override
    public String getOwnerName() {
        return "Owner 4";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS04BV3243";
    }

    public int speed() {
        return 65;
    }

    public int tempControl() {
        System.out.println("Control temperature");
        return 32;
    }
}
