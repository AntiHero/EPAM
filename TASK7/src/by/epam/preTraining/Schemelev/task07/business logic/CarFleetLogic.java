package by.epam.preTraining.Schemelev.task07.businesslogic;

import by.epam.preTraining.Schemelev.task07.model.CarFleet;
import by.epam.preTraining.Schemelev.task07.model.Vehicle;
import by.epam.preTraining.Schemelev.task07.model.LightVehicle;
import by.epam.preTraining.Schemelev.task07.model.Truck;
import by.epam.preTraining.Schemelev.task07.util.View;

public class CarFleetLogic {
    CarFleet carFleet;
    
    public static boolean isEmpty(CarFleet carFleet) {
        boolean result = true;
        
        if (carFleet.getContainer().getFix()) {
            if (carFleet.getContainer().getLightVehicleNumber() != 0 
                    || carFleet.getContainer().getTruckNumber() != 0) {
                result = false;
            }
        } else {
            if (!carFleet.getContainer().getLightVehicle().isEmpty()
                    || !carFleet.getContainer().getTruck().isEmpty()) {
                result = false;
            }
        }
        return result;
    }
    
    public static void showCars(CarFleet carFleet) {
        View.print("---------------Your Car Fleet--------------");
        View.print("---------------Light Vehicles--------------");
        
        for (int i = 0; i < carFleet.getContainer().getLightVehicleNumber(); i++) {
            View.print(carFleet.getContainer().getLightVehicle(i));
        }
        
        View.print("------------------Trucks------------------");
        for (int i = 0; i < carFleet.getContainer().getTruckNumber(); i++) {
            View.print(carFleet.getContainer().getTruck(i));
        }
    }
    
    public static void findSportCars(CarFleet carFleet) {
        View.print("\n---------------Sport Cars--------------\n");
        
        for (int i = 0; i < carFleet.getContainer().getLightVehicleNumber(); i++) {
            if (carFleet.getContainer().getLightVehicle(i).getLuxuryClass().equals("S-class")) {
                View.print(carFleet.getContainer().getLightVehicle(i));
            }
        }
    }
    
    public static void findTruckWithMaxCapacity(CarFleet carFleet) {
        View.print("-------Truck with maximum capacity-------");
        int index = 0;
        
        for (int i = 0; i < carFleet.getContainer().getTruckNumber() - 1; i++) {
            if (carFleet.getContainer().getTruck(index).getMaxCapacity() < carFleet.getContainer().getTruck(i + 1).getMaxCapacity()) {
                index = i + 1;
            } 
        }
        View.print(carFleet.getContainer().getTruck(index));
    }
    
    public static void addCar(Vehicle vehicle, CarFleet carFleet) {
        View.print("\n---------Recently added vehicles---------");
        
        carFleet.addCar(vehicle);
        
        if (vehicle instanceof LightVehicle) {
            View.print((LightVehicle)vehicle);
        } else if (vehicle instanceof Truck) {
            View.print((Truck)vehicle);
        } else {
            View.print(vehicle);
        }
    }
    
    public static void clearCarFleet(CarFleet carFleet) {
        if (carFleet.getContainer().getFix()) {
            for (int i = 0; i < carFleet.getContainer().getLightVehicleNumber(); i++) {
                carFleet.getContainer().setLightVehicle(null, i);
            }
            
            for (int i = 0; i < carFleet.getContainer().getTruckNumber(); i++) {
                carFleet.getContainer().setTruck(null, i);
            }
        } else {
           carFleet.getContainer().clearLightVehicleDynamic();
           carFleet.getContainer().clearTruckDynamic();
        }
    }
        
}
