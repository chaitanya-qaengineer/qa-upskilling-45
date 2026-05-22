package day08;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Tesla Bike");
        Vehicle truck = new Truck("Volvo");

        car.displayBrand();
        car.fuelType();

        bike.displayBrand();
        bike.fuelType();

        truck.displayBrand();
        truck.fuelType();

        Drivable d1 = new Car("Honda");
        d1.drive();
    }
}