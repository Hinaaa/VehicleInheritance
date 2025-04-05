package org.example;

public class Car extends Vehicle{
    int NumberOfDoors;

    public Car(String brand, String model, String color, String manufacturer, int year, double price, double manufacturerCost, int numberOfDoors) {
        super(brand, model, color, manufacturer, year, price, manufacturerCost);
        NumberOfDoors = numberOfDoors;
    }
    //here overriding this method created in Vehicle Class
    @Override
    public String vehicleInfo() {
        return "Brand: " + getBrand() +
                ", Model: " + getModel() +
                ", Color: " + getColor() +
                ", Manufacturer: " + getManufacturer() +
                ", Year: " + getYear() +
                ", Price: $" + getPrice() +
                ", Manufacturer Cost: $" + getManufacturer()+
                ", NumberOfDoors: " + NumberOfDoors;
    }
    @Override
    public String toString() {
        return "Car{" +
                "NumberOfDoors=" + NumberOfDoors +
                "} " + super.toString();
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }
}
