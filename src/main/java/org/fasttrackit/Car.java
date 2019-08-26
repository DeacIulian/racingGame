package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    int doorCount;
    double traveledDistance;
    boolean running;
    // has-a relationship (relatie de agregare)
    Engine engine;
}
