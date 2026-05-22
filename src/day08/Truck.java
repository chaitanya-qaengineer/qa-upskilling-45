package day08;

class Truck extends Vehicle implements Drivable {

    Truck(String brand) {
        super(brand);
    }

    @Override
    void fuelType() {
        System.out.println("Fuel Type: Diesel");
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}