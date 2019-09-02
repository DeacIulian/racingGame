package org.fasttrackit;

import java.sql.SQLOutput;

public class Vehicle {
    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is acceerating with " + speed + " km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;

        //SAME RESULT AS THE ABOVE STATEMENT
        //       traveledDistance += distance;

        double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

}
