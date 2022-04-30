package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sw, index, temp, choice, bp;
        double light;
        String nam, inf, dungeater;
        Scanner scan = new Scanner(System.in);
        Boolean keeper = true;
        Plant rat = new Plant();
        Plant[] garden;
        garden = new Plant[10];
        for (int i = 0; i<10; i++)
            garden[i] = new Plant();
        while (keeper){
            System.out.println("Option are:\n" +
                    "1 - Create a garden;\n" +
                    "2 - Set plant info\n" +
                    "3 - Get some sort of info\n" +
                    "4 - add or delete a plant\n" +
                    "5 - do some gardening (watering, setting temperature, lighting, do something special) ");
            sw = scan.nextInt();
            switch (sw){
                case 1:
                    System.out.println("You received garden with 10 anonymous plants");
                    garden = new Plant[10];
                    for (int i = 0; i<10; i++)
                        garden[i] = new Plant();
                    break;
                case 2:
                    System.out.println("Choose the plant you want to set or edit");
                    index = scan.nextInt();
                    System.out.println("Choose the kind of info you want to edit:\n" +
                            "1 - type;\n" +
                            "2- name, other info and birthplace\n");
                    sw = scan.nextInt();
                    switch (sw){
                        case 1:
                            System.out.println("Choose the type you want to assignate: 1 - nothing special; 2 - flower; 3 - bush; 4 - room");
                            sw = scan.nextInt();
                            switch (sw){
                                default:
                                    garden[index] = new Plant();
                                    break;
                                case 2:
                                    garden[index] = new FlowerPlant();
                                    break;
                                case 3:
                                    garden[index] = new BushPlant();
                                    break;
                                case 4:
                                    garden[index] = new RoomPlant();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Give the plant a name : ");
                            dungeater = scan.nextLine();
                            nam = scan.nextLine();
                            System.out.println("Tell something about the plant");
                            inf = scan.nextLine();
                           System.out.println("Give the birthplace of the plant");
                            bp = scan.nextInt();
                            garden[index].SetPlantInfo(nam,inf,bp);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Choose what plants you want to get info on:\n" +
                            "1 - all of garden\n" +
                            "2 - of a given name\n" +
                            "3 - of a given origin");
                    sw = scan.nextInt();
                    switch (sw){
                        case 1: rat.GetPlants(garden);break;
                        case 2:
                            System.out.println("give the name you seek for");
                            dungeater = scan.nextLine();
                            nam = scan.nextLine();
                            rat.GetPlantOfName(nam,garden);
                            break;
                        case 3:
                            System.out.println("Give the origin you strive for");
                            bp = scan.nextInt();
                            rat.GetPlantOfBirthPlace(bp, garden);
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Do you want to delete one or add?\n" +
                            "1 - add;\n" +
                            "2- delete");
                    sw = scan.nextInt();
                    switch (sw){
                        case 1:
                            garden = rat.AddPlant(garden);
                            break;
                        case 2:
                            System.out.println("Choose the index of the plant you want to add or delete");
                            index = scan.nextInt();
                            garden = rat.DelPlant(garden,index);
                            break;
                    }
                    break;

                case 5:     
                    System.out.println("Give the index of the plant you want to gardening with");
                    index= scan.nextInt();
                    System.out.println("Choose the kind of gardening you want to do: 1 - water plants; 2 - set lighting; 3 - set temperature; 4 - do something special;");
                    sw = scan.nextInt();
                    switch (sw){
                        case 1:
                            System.out.println("The watering is complete");
                            garden[index].Water();
                            break;
                        case 2:
                            System.out.println("What illuminance do you want to set?");
                            light = scan.nextDouble();
                            garden[index].SetLighting(light);
                            break;
                        case 3:
                            System.out.println("What temperature do you want to set?");
                            temp = scan.nextInt();
                            garden[index].SetTemp(temp);
                            break;
                        case 4:
                            if((garden[index] instanceof RoomPlant) || (garden[index] instanceof BushPlant) || (garden[index] instanceof FlowerPlant) )
                                garden[index].Special();
                            else
                                System.out.println("The plant is too basic");
                            break;
                    }
                    break;
                default:
                    keeper = Boolean.FALSE;
            }
        }
    }
      /*Растение. Возможности: задать и редактировать информацию о растении; по-
лучить информацию об имеющихся растениях в оранжерее/растениях опреде-
ленного вида/месте происхождения; закупить новый вид растений; произвести
полив; задать температуру; установить освещение; выкопать определенный
вид растений (убрать из оранжереи). Добавить специализированные методы
для Кустовое растение, Цветковое растение, Комнатное растение.*/
}
