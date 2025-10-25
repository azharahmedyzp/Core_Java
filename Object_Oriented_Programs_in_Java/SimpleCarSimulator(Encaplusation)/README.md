# Java OOP Car Simulation

This is a simple **Java program** that demonstrates **Object-Oriented Programming (OOP)** concepts, especially **encapsulation**.  
The program models a `Car` class with private properties and public methods to control its behavior.

## Program Overview

The `Car` class simulates basic car operations:
- **Engine status** (`engineStatus`) — ON or OFF
- **Speed** (`speed`) — current speed with a maximum limit of 180 km/h
- **Fuel level** (`fuelLevel`) — percentage of fuel in the tank

Public methods allow the user to:
- Start and stop the engine
- Accelerate the car (with speed and fuel rules)
- Refuel the car
- Display the current status via a dashboard

## Concepts Demonstrated

- **Encapsulation:**  
  All properties are private and can only be accessed or modified through controlled public methods, ensuring the internal state is safe from invalid changes.  
- **Data validation:**  
  Methods enforce rules like maximum speed, positive fuel, and engine-dependent acceleration.  
- **OOP behavior modeling:**  
  The class mimics real-world car operations through structured methods.
