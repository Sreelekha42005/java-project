package com.overriding;

class Vehicle {
 public void start() {
     System.out.println("Vehicle started");
 }
}


class Car extends Vehicle {
 @Override
 public void start() {
     System.out.println("Car started");
 }
}


public class Test2 {
 public static void main(String[] args) {
     Vehicle v = new Vehicle();
     Car c = new Car();

     v.start();
     c.start();
 }
}
