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
        car.setName("Dacia");
        car.setFuelLevel(60);
        car.setMileage(8.5);
        car.setMaxSpeed(180);
        car.setFuelType("Gasoline");


        System.out.println("Car object: " + car.toString());

        System.out.println(car.getName());
        System.out.println(car.getTraveledDistance());
        System.out.println(car.isRunning());


        Engine engine2 = new Engine();
        engine2.manufacturer = "Volkswagen";
        engine2.capacity = 1900;

        Car car2 = new Car(engine2);
        car2.setName("Golf");
//        car.name = "Skoda";

        car.accelerate(60,1);

        car.accelerate(90);

        car2.setFuelLevel(65);
        car2.setMileage(9);
        car2.doorCount = 3;
        car2.setMaxSpeed(200);
        car2.setFuelType("Diesel");
        //concatenation    concatenare
        //sout - System.out.println
        //ctrl+d - dubleaza linia
        System.out.println(car2.getName());
        System.out.println(car2.getTraveledDistance());
        System.out.println(car2.isRunning());

        HybridCar car3 = new HybridCar();
        car3.setName("Hyundai");
        car3.setFuelLevel(50);
        car3.setMileage(8);
        car3.setMaxSpeed(260);
        car3.setFuelType("Gasoline/Electric");

        car3.accelerate(80);

        System.out.println("Fuel level: " + car3.getFuelLevel());
        System.out.println("Traveled distance " + car3.getTraveledDistance());


//        System.out.println("Static variables example: ");

//        car.totalCount = 1;

//        System.out.println("Total count in car: " + car.totalCount);

//        car2.totalCount= 2;

//        System.out.println("Total count after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Class: " + Car.totalCount);


    }

}
