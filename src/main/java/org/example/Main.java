package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW M","M4 CS","Grey Metallic","BMW",2025,123500.89,35000.90 );
        Car car = new Car("BMW M","M4 CS","Grey Metallic","BMW",2025,123500.89,35000.90,5 );
        System.out.println(car);

        //print Info about Vehicle from Vehicle Class new method
        System.out.println("Vehicle Info: "+vehicle.vehicleInfo()); //from Vehicle Class call method Vehicle Info
        System.out.println("Car Info: "+car.vehicleInfo());//Doors from inherited class Car, and overrided method from Vehicle Class

    }
    }