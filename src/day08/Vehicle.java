package day08;

abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    abstract void fuelType();
}