package by.epam.preTraining.Schemelev.task07.main;

import by.epam.preTraining.Schemelev.task07.instances.*;
import by.epam.preTraining.Schemelev.task07.utils.*;

public class Main {
    public static void main(String[] args) {
        CarFleet carFleet = new CarFleet();

        Vehicle undefined = new Vehicle();
        Vehicle BMW = new LightVehicle(2020, "BMW 730i", "Business class");
        Vehicle MAN = new Truck(4820, "MAN", 8500);
        Vehicle Ford = new LightVehicle(1900, "Ford Mustang", "Business class");
        Vehicle Opel = new LightVehicle(3450, "Opel Corso", "Budget class");
        Vehicle Duff = new Truck(5500, "DUFF", 11200);

        carFleet.addCar(undefined);
        carFleet.addCar(BMW);
        carFleet.addCar(MAN);
        carFleet.addCar(Ford);
        carFleet.addCar(Opel);
        carFleet.addCar(Duff);
        carFleet.addCars(2, undefined);

        int numberOfCars = Utils.getCarsQuantity(carFleet);
        System.out.printf("Number of cars in your Fleet is: %d, number of trucks: %d, number of light vehicles: %d",
                Utils.getCarsQuantity(carFleet), carFleet.getNumberOfTrucks(), carFleet.getNumberOfLightVehicles());

        String cars = Utils.getVehicles(carFleet);
        System.out.printf("\nCars in your Fleet: %s", cars);

        int totalMass = Utils.getTotalMass(carFleet);
        System.out.printf("\nTotal mass of all vehicles is %d kg", totalMass);

        int totalLuxuryCars = Utils.getTotalLuxuryCars(carFleet);
        System.out.printf("\nTotal number of luxury cars is: %d", totalLuxuryCars);

    }

}
