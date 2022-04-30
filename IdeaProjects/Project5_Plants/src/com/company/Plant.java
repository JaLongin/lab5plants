package com.company;

public class Plant implements PlantActions {
    StringBuilder info, name;
    int birthPlaceNo, temperature;
    Boolean watered;
    Double lighting;
    public Plant(){
        info = new StringBuilder("No info");
        name = new StringBuilder("No name");
        watered = Boolean.FALSE;
        temperature = 20;
        lighting = 500.00;
    }
    public void SetLighting(double light){
        lighting = light;
    }

    @Override
    public void SetPlantInfo(String nam, String inf, int birth) {
        name = new StringBuilder(nam);
        info = new StringBuilder(inf);
        birthPlaceNo = birth;
    }
    @Override
    public Plant[] DelPlant(Plant[] array, int index){
        Plant[] temp3 = new Plant[array.length-1];
        if(index <= array.length-1){
            if (index>0){
                for (int i = 0; i<index;i++)
                    temp3[i] = array[i];
            }
            if (array.length - index > 1){
                for (int i = 0; i < array.length - index - 1; i++)
                    temp3[index + i] = array[index + 1 + i];
            }
        }
        return temp3;
    }
    @Override
    public void SetTemp(int temp) {
        temperature = temp;
    }

    @Override
    public Plant[] AddPlant(Plant[] array) {
        Plant[] temp = new Plant[array.length+1];
        for (int i = 0; i< array.length; i++)
            temp[i] = array[i];
        temp[array.length] = new Plant();
        return temp;
    }

    @Override
    public void GetPlants(Plant[] array) {
        for(int i = 0; i< array.length; i++)
            array[i].GetPlant();
    }

    @Override
    public void GetPlant() {
        System.out.println(name + "\n"+ info + "\nBorn in place" + birthPlaceNo+ "\nwatered status: " + watered + "\n" +
                "temperature is " + temperature + "C\nilluminance is " + lighting + " lux"+'\n');
    }

    @Override
    public void Water() {
        watered = Boolean.TRUE;
    }

    @Override
    public void GetPlantOfName(String nam, Plant[] array) {
        for (int i=0; i<array.length; i++){
            if (array[i].name.toString().equals(nam))
                array[i].GetPlant();
        }
    }

    @Override
    public void GetPlantOfBirthPlace(int bp, Plant[] array) {
        for (int i = 0; i< array.length; i++)
            if (array[i].birthPlaceNo==bp)
                array[i].GetPlant();
    }

    /* Illuminance (lux)
    Surfaces illuminated by
0.3             Full moon on a clear night
50              Family living room lights (Australia, 1998) – This is pretty dark in my opinion
80              Office building hallway lighting
320–500         Office lighting
400             Sunrise or Sunset on a clear day
1000            Overcast day (Same light they use in a studio)
10,000–25,000   Full daylight (but not direct sun)
32,000–100,000  Direct Sunlight*/
}
 /*Растение. Возможности: задать и редактировать информацию о растении; по-
лучить информацию об имеющихся растениях в оранжерее/растениях опреде-
ленного вида/месте происхождения; закупить новый вид растений; произвести
полив; задать температуру; установить освещение; выкопать определенный
вид растений (убрать из оранжереи). Добавить специализированные методы
для Кустовое растение, Цветковое растение, Комнатное растение.*/