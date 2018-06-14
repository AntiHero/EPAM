package by.epam.preTraining.Schemelev.task07.instances;

import java.util.Arrays;

public class CarFleet {
    private Vehicle[] vehicles;
    private int numberOfTrucks;
    private int numberOfLightVehicles;
    private static int luxuryCars;
    private static int trucksCapasity;
    private String make;

    public CarFleet() {
        numberOfLightVehicles = 0;
        numberOfTrucks = 0;
        vehicles = new Vehicle[50];
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void setNumberOfTrucks(int trucks) {
        numberOfTrucks += trucks;
    }

    public int getNumberOfLightVehicles() {
        return numberOfLightVehicles;
    }

    public void setNumberOfLightVehicles(int lightVehicles) {
        numberOfLightVehicles += lightVehicles;
    }

    public void setNumberOfVehicles(int size) {
        if (size <= 0) {
            System.out.println("Wrong number of vehicles!");
        } else {
            vehicles = new Vehicle[size];
        }
    }

    public int getNumberOfVehicles() {
        int number = 0;

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                number++;
            }
        }
        return number;
    }

    public static void setLuxuryCars(int luxuryVehicle) {
        luxuryCars += luxuryVehicle;
    }

    public static int getLuxuryCars() {
        return luxuryCars;
    }

    public void setTrucksCapasity(int vehicleCapacity) {
        trucksCapasity += vehicleCapacity;
    }

    public int getTrucksCapasity() {
        return trucksCapasity;
    }

    public Vehicle getVehicle(int number) {
        if (number >= vehicles.length) {
            System.out.println("Wrong vehicle number!");
        }
        return vehicles[number];
    }

    public void setVehicle(int number, Vehicle vehicle) {
        if (number >= vehicles.length) {
            System.out.println("Wrong vehicle number!");
        }
        vehicles[number] = vehicle;
    }

    public void addCar(Vehicle vehicle) {
        if (vehicle.getMass() < 3500) {
            setNumberOfLightVehicles(1);
        } else {
            setNumberOfTrucks(1);
        }

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            }
        }
    }

    public void addCars(int numberOfCars, Vehicle vehicle) {
        if (numberOfCars <= 0) {
            System.out.println("No vehicles!");
        } else {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i] == null) {
                    for (int j = 0; j < numberOfCars; j++) {
                        vehicles[i + j] = vehicle;

                        if (vehicles[i].getMass() < 3500) {
                            setNumberOfLightVehicles(1);
                        } else {
                            setNumberOfTrucks(1);
                        }
                    }
                    break;
                }
            }
        }
    }
}
