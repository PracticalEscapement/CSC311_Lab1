package org.example;

public class Car extends Vehicle {

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk Honk");
    }

    public String displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: " + this.brand);
        sb.append("\n# Wheels: " + this.getNumberOfWheels());
        sb.append("\nColor: " + this.getColor());
        sb.append("\nFuel Type: " + this.getFuelType());
        return sb.toString();
    }


}
