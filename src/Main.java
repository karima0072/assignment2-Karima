public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Karima", "007KAR");
        Driver driver2 = new Driver("Aknur", "888AKO");

        Car car = new Car("BMW", 2024, 4, "Gasoline");
        Motorcycle moto = new Motorcycle("Suzuki", 2019, false);
        Truck truck = new Truck("Volvo", 2018, 10.5, 6);

        car.setDriver(driver1);
        moto.setDriver(driver2);
        truck.setDriver(driver1);

        Vehicle[] vehicles = {car, moto, truck};
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            v.displayDriver();
            System.out.println("------");
        }
    }
}
