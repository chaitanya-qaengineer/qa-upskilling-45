package day08;

class Bike extends Vehicle implements Drivable {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Electric");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }
}