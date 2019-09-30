package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vehicle {

    static int totalCount;


   private String name;
   private double mileage;
   private double maxSpeed;
   private String fuelType;
   private double fuelLevel;
   private double traveledDistance;
   private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed){
        return accelerate(speed, 1);
    }

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
        /*
        incremeting/decremeting by 1

        fuelLevel = fuelLevel + 1;
        fuelLevel += 1;
        fuelLevel++;
         */


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from user: " + text);

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelType='" + fuelType + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", running=" + running +
                '}';
    }
}
