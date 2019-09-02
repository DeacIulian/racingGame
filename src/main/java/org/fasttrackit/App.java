package org.fasttrackit;

import java.util.concurrent.Callable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //this is an one-line comment
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;
        Car car = new Car(engine);
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";


        Engine engine2 = new Engine();
        engine2.manufacturer = "Volkswagen";
        engine2.capacity = 1900;

        Car car2 = new Car(engine2);
        car2.name = "Golf";
//        car.name = "Skoda";

        car.accelerate(60,1);

        car2.fuelLevel = 65;
        car2.mileage = 9;
        car2.doorCount = 3;
        car2.maxSpeed = 200;
        car2.fuelType = "Diesel";
        //concatenation    concatenare
        //sout - System.out.println
        //ctrl+d - dubleaza linia
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);


    }
}
