# Vehicle and Car Inheritance

## Overview
This project demonstrates inheritance, method overriding, and encapsulation in Java using two classes: `Vehicle` and `Car`. The `Car` class inherits from `Vehicle` and overrides methods to display additional information.

## How It Works
- `Vehicle` class contains basic properties like `brand`, `model`, `color`, `manufacturer`, `year`, `price`, and `manufacturerCost`, along with a method to display vehicle details (`vehicleInfo()`).
- `Car` class inherits from `Vehicle`, adding the `NumberOfDoors` property and overriding `vehicleInfo()` to include the number of doors.
- The `Main` class creates objects of `Vehicle` and `Car`, demonstrating the inheritance and method overriding. 

## Classes

**Vehicle Class**  
Defines attributes like `brand`, `model`, `color`, `manufacturer`, `year`, `price`, and `manufacturerCost`, along with methods for retrieving and displaying vehicle information.
**Car Class**  
Inherits from `Vehicle` and adds the `NumberOfDoors` attribute. It overrides the `vehicleInfo()` method and `toString()` method to include the number of doors.
**Main Class**  
Demonstrates the creation of `Vehicle` and `Car` objects, calling `vehicleInfo()` and `toString()` to display their information.

## Key Concepts
- **Inheritance**: `Car` inherits properties and methods from `Vehicle`.
- **Method Overriding**: `Car` overrides the `vehicleInfo()` method from `Vehicle` to include `NumberOfDoors`.
- **Encapsulation**: Attributes of the `Vehicle` class are encapsulated, and getter and setter methods are used to access them.

## Requirements
- Java 17 or later
