package com.company;

public class RoomPlant extends Plant{
    private Boolean dropped;
    public RoomPlant(){
        dropped = Boolean.FALSE;
    }
    public void Special(){
        dropped = Boolean.TRUE;
    }

    @Override
    public void GetPlant() {
        System.out.println(name + "\n"+ info + "\nBorn in place" + birthPlaceNo+ "\nwatered status: " + watered + "\n" +
                "temperature is " + temperature + "C\nilluminance is " + lighting + " lux"+'\n' + "drop status: " + dropped + "\n");
    }
}
