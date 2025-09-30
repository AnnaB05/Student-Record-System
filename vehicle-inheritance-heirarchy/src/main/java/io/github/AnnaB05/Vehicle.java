package io.github.AnnaB05;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    //abstract method to be implemented by subclasses
    public abstract void startEngine();

    @Override
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }

}
