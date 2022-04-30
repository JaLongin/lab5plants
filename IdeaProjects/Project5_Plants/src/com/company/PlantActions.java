package com.company;

public interface PlantActions {
    void SetPlantInfo(String nam, String inf, int birth);
    void GetPlants(Plant[] array);
    void GetPlant();
    Plant[] AddPlant(Plant[] array);
    void SetTemp(int temp);
    void Water();
    void SetLighting(double light);
    Plant[] DelPlant(Plant[] array, int index);
    void GetPlantOfName(String nam, Plant[] array);
    void GetPlantOfBirthPlace(int bp, Plant[] array);
    default void Special(){}
    /*Растение. Возможности: задать и редактировать информацию о растении; по-
лучить информацию об имеющихся растениях в оранжерее/растениях опреде-
ленного вида/месте происхождения; закупить новый вид растений; произвести
полив; задать температуру; установить освещение; выкопать определенный
вид растений (убрать из оранжереи). Добавить специализированные методы
для Кустовое растение, Цветковое растение, Комнатное растение.*/
}
