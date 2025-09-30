package io.github.AnnaB05;

public class Car extends Vehicle{
    private int numDoors;
    private FuelType fuelType; //enum

    public Car(String brand, int year, int numDoors, FuelType fuelType) {
        super(brand, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        //Implementation for car
        System.out.println("Car engine started with a roar!");
    }


}
