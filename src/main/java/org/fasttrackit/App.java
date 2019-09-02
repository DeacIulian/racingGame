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
        Car car = new Car();
        car.name = "Renault";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        car.engine = engine;


        Car car2 = new Car();
        car2.name = "Golf";
//        car.name = "Skoda";


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
