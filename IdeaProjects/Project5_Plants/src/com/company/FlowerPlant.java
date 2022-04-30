package com.company;

public class FlowerPlant extends Plant{
    private Boolean sniffed;
    public FlowerPlant(){
        sniffed = Boolean.FALSE;
    }
    public void Special(){
        sniffed = Boolean.TRUE;
    }
    @Override
    public void GetPlant() {
        System.out.println(name + "\n"+ info + "\nBorn in place" + birthPlaceNo+ "\nwatered status: " + watered + "\n" +
                "temperature is " + temperature + "C\nilluminance is " + lighting + " lux"+'\n' + "sniffed status: " + sniffed + "\n");
    }
}
