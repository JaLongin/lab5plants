package com.company;

public class BushPlant extends Plant{
    private Boolean cut;
    public BushPlant(){
        cut = Boolean.FALSE;
    }
    public void Special(){
        cut = Boolean.TRUE;
    }

    @Override
    public void GetPlant() {
        System.out.println(name + "\n"+ info + "\nBorn in place" + birthPlaceNo+ "\nwatered status: " + watered + "\n" +
                "temperature is " + temperature + "C\nilluminance is " + lighting + " lux"+'\n' + "cut status: " + cut + "\n");
    }
}
