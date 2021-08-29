
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sefa_
 */
public class Car {
    String color = "";
    String model = "";
    int year = 0;
    int door = 0;
    int wheel = 0;
    
public static int carMoney(int year, String color){
    int money = 10000;
    if(year > 2000){
        System.out.println("year > 2000 +1000 money");
        money += 1000;
    }
    else{
        money += 0;
    }
    if(color != "blue"){
        System.out.println("year != blue +500 money");
        money += 500;
    }
     else{
        money += 0;
    }

    return money;
}

    public Car(String color, int door, String model, int whell, int year) {
       this.year = year;
       this.color = color;
       this.door = door;
       this.wheel = whell;
       this.model = model;
       System.out.println("********************* Car *******************");
       System.out.println("Color: " + color + "\n" + "Door: " + door + "\n" + "Model: " + model + 
               "\n" +"Year: " + year + "\n" +"Whell: " + whell);
       System.out.println("********************* MONEY *******************");
       System.out.println(Car.carMoney(year, color));
   }
    }



