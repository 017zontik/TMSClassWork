package src.com.lesson8;

public class Main {
    public static void main(String[] args) {
        PassengerTransport car = new PassengerTransport();
        car.setPower(255);
        car.setMaxSpeed(130);
        car.setWeight(1600);
        car.setName("Alfa Romeo");

        car.setType("седан");
        car.setNumWheels(4);

        car.setFuelConsumption(10);
        car.setNumberOfPassengers(4);

        System.out.println(car.description());
        car.printMaxDistanceAndConsumption(1f);

        CargoTransport cargo = new CargoTransport();
        cargo.setLoadCapacity(45000);
        cargo.printCanBeLoaded(47000);

        CivilTransport civil = new CivilTransport();
        civil.setNumberOfPassengers(200);
        civil.setBusinessClass(false);
        civil.printCapacity(300);
        civil.checkBusinessClass();

        MilitaryTransport military = new MilitaryTransport();
        military.checkCatapult();
        military.setRocket(2);
        military.shot();
        military.shot();
        military.shot();
    }
}
