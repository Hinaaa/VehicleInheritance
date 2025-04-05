package org.example;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private String color;
    private String manufacturer;
    private int year = 2025;
    private double price;
    private double manufacturerCost;

    //constructor
    public Vehicle(String brand, String model, String color, String manufacturer, int year, double price, double manufacturerCost) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.manufacturerCost = manufacturerCost;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", manufacturerCost=" + manufacturerCost +
                '}';
    }
    //Encapsulation
    public String vehicleInfo() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Color: " + color +
                ", Manufacturer: " + manufacturer +
                ", Year: " + year +
                ", Price: $" + price +
                ", Manufacturer Cost: $" + manufacturerCost;

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Double.compare(price, vehicle.price) == 0 && Double.compare(manufacturerCost, vehicle.manufacturerCost) == 0 && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(color, vehicle.color) && Objects.equals(manufacturer, vehicle.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, manufacturer, year, price, manufacturerCost);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getManufacturerCost() {
        return manufacturerCost;
    }

    public void setManufacturerCost(double manufacturerCost) {
        this.manufacturerCost = manufacturerCost;
    }
}
