package fhcampus.group9.decorator;

public class App {
    public static void main(String[] args) {
        Car electricVehicle = new BenzinVehicle(new ElectricVehicle(new SportsCar()));
        System.out.println(electricVehicle.getDescription());

        Car dieselVehicle = new DieselVehicle(new FamilyVan());
        System.out.println(dieselVehicle.getDescription());
        System.out.println(dieselVehicle.getCost());

        Car benzinVehicle = new BenzinVehicle(new CompactCar());
        System.out.println(benzinVehicle.getDescription());
    }
}

