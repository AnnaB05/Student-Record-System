package io.github.AnnaB05;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(
                "Toyota",
                2022,
                4,
                FuelType.GAS
        );

        Vehicle truck = new Truck(
                "Ford",
                2021,
                5000
        );

        Vehicle motor = new Motorcycle(
                "Harley Davidson",
                2020,
                false
        );

        //Demonstrate polymorphism
        Vehicle[] vehicles = {car, truck, motor};
        for (Vehicle v : vehicles) {
            v.startEngine(); // polymorphic use of sartEngine
            System.out.println(v); //uses toString
        }



    }
}