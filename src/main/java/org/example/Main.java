package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, "Red", 5000, "Gas", "BMW");
        myCar.honk();
        System.out.println(myCar.displayInfo());
    }
}