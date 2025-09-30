package io.github.AnnaB05;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle (String brand, int year, boolean hasSidecar) {
        super(brand, year);
    }
    @Override
    public void startEngine() {
        //Implementation for motorcycle
        System.out.println("Motorcycle engine purrs to life!");
    }
}
