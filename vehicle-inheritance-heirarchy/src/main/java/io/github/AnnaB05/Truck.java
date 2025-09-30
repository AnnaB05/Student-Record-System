package io.github.AnnaB05;

public class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startEngine() {
        //Implementation for truck
        System.out.println("Truck engine rumbles to life!");
    }
}
