package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Hero extends Vehicle{
    @Override
    public String getModelName() {
        return "Hero";
    }

    @Override
    public String getOwnerName() {
        return "Owner1";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public int getSpeed() {
        return 30;
    }

    public void radio() {
        System.out.println("Control radio");
    }
}
