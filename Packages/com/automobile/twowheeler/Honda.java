package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return "Honda";
    }

    @Override
    public String getOwnerName() {
        return "Owner2";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP02CD4567";
    }

    public int getSpeed() {
        return 70;
    }

    public void cdplayer(){
        System.out.println("Control CD player");
    }

}
