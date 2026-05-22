package day08;

class Car extends Vehicle implements Drivable {

    Car(String brand) {
        super(brand);
    }

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}