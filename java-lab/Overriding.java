// 1. Write a program to create a class named Vehicle having protected instance
// variables regnNumber, speed, color, ownerName and a method showData ( ) to
// show “This is a vehicle class”. Inherit the Vehicle class into subclasses
// named Bus and Car having individual private instance variables routeNumber in
// Bus and manufacturerName in Car and both of them having showData ( ) method
// showing all details of Bus and Car respectively with content of the super
// class’s showData ( ) method.

import java.util.*;

class Vehicle {
    protected int regNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(int regNumber, int speed, String color, String ownerName) {
        this.regNumber = regNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.print("\nThis is a vehicle class .");
    }
}

class Bus extends Vehicle {
    protected int routeNumber;

    public Bus(int regNumber,int speed,String color,String ownerName,int routeNumber){
        super(regNumber,speed,color,ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        System.out.print("\nThe registration Number of the Bus :- " + regNumber);
        System.out.print("\nThe speed of the bus :- " + speed);
        System.out.print("\nThe color of the bus :- " + color);
        System.out.print("\nThe owner name of the Bus :- " + ownerName);
        System.out.print("\nThe route number of the bus :- " + routeNumber);
    }
}

class Car extends Vehicle {
    protected String manufacturerName;

    public Car(int regNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        System.out.print("\nThe registration Number of the car :- " + regNumber);
        System.out.print("\nThe speed of the car :- " + speed);
        System.out.print("\nThe color of the car :- " + color);
        System.out.print("\nThe owner name of the car :- " + ownerName);
        System.out.print("\nThe route number of the car :- " + manufacturerName);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bus obj1 = new Bus(111111, 100,"black","Aniket",12345);
        Car obj2 = new Car(222222, 150,"White","Anurag","srikanta");

        obj1.showData();
        System.out.println("\n");
        obj2.showData();
    }
}