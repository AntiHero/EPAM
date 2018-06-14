package by.epam.preTraining.Schemelev.task07.utils;

import by.epam.preTraining.Schemelev.task07.instances.*;

public class Utils {
    CarFleet carFleet;

    public static int getCarsQuantity(CarFleet carFleet) {
        return carFleet.getNumberOfLightVehicles() + carFleet.getNumberOfTrucks();
    }

    public static String getVehicles(CarFleet carFleet) {
        String cars = "";

        int number = 0;

        while (carFleet.getVehicle(number) != null) {
            cars += carFleet.getVehicle(number).getMake() + ", ";
            number++;
        }
        return cars;
    }
    
    public boolean isEmptyFleet(CarFleet carFleet) {
        if (carFleet.getNumberOfLightVehicles() + carFleet.getNumberOfTrucks() == 0) {
            return true;
        }
        return true;
    }
    
    public void deleteVehicle(CarFleet carFleet, int index) {
        carFleet.setVehicle(index, null);
    }
    
    public static int getTotalMass(CarFleet carFleet) {
        int number = carFleet.getNumberOfVehicles();
        int mass = 0;
        
        for (int i = 0; i < number; i++) {
            mass += carFleet.getVehicle(i).getMass();
        }
        return mass;
    }
    
    public static int getTotalLuxuryCars(CarFleet carFleet) {
        return CarFleet.getLuxuryCars();
    }
}
