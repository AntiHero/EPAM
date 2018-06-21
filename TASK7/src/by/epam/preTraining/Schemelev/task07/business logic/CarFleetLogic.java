package by.epam.preTraining.Schemelev.task07.businesslogic;

import by.epam.preTraining.Schemelev.task07.model.*;
import java.util.ArrayList;
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
       
        
        if (carFleet.getContainer().getFix()) {
            View.print("---------------Light Vehicles--------------");
            for (int i = 0; i < carFleet.getContainer().getLightVehicleNumber(); i++) {
                View.print(carFleet.getContainer().getLightVehicle(i));
            }
        
            View.print("------------------Trucks------------------");
            for (int i = 0; i < carFleet.getContainer().getTruckNumber(); i++) {
                View.print(carFleet.getContainer().getTruck(i));
            }
        } else {
            View.print("---------------Light Vehicles--------------");
            for (LightVehicle vehicle : carFleet.getContainer().getLightVehicle()) {
               
                View.print(vehicle);
            }
            
            View.print("------------------Trucks------------------");
            for (Truck vehicle : carFleet.getContainer().getTruck()) {
                View.print(vehicle);
            }
        }
    }
    
    public static void findSportCars(CarFleet carFleet) {
        View.print("\n---------------Sport Cars--------------");
        
        if (carFleet.getContainer().getFix()) {
            for (int i = 0; i < carFleet.getContainer().getLightVehicleNumber(); i++) {
                if (carFleet.getContainer().getLightVehicle(i).getLuxuryClass().equals("S-class")) {
                    View.print(carFleet.getContainer().getLightVehicle(i));
                }
            }
        } else {
            for (LightVehicle vehicle : carFleet.getContainer().getLightVehicle()) {
                if (vehicle.getLuxuryClass().equals("S-class")) {
                    View.print(vehicle);
                }
            }
        }
    }
    
    public static void findTruckWithMaxCapacity(CarFleet carFleet) {
        
        int index = 0;
        
        if (carFleet.getContainer().getFix()) {
            for (int i = 0; i < carFleet.getContainer().getTruckNumber() - 1; i++) {
                if (carFleet.getContainer().getTruck(index).getMaxCapacity() 
                        < carFleet.getContainer().getTruck(i + 1).getMaxCapacity()) {
                    index = i + 1;
                }
            }
            View.print("\n-------Truck with maximum capacity-------");
            View.print(carFleet.getContainer().getTruck(index));
            index = 0;
        } else {
            for (int i = 0; i < carFleet.getContainer().getTruck().size() - 1; i++) {
                if (carFleet.getContainer().getTruck().get(i).getMaxCapacity() 
                        < carFleet.getContainer().getTruck().get(i + 1).getMaxCapacity()) {
                    index = i + 1;
                }
                View.print("\n-------Truck with maximum capacity-------");
                View.print(carFleet.getContainer().getTruck().get(index));
            }
        }
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
    
    public static void removeCar(CarFleet carFleet, String str, int index) {
        View.print("\n--------Recently removed vehicles--------");
        Vehicle vehicle = new Vehicle();
        
        if (str.equals("LightVehicle")) {
            vehicle = new LightVehicle();
            View.print(carFleet.getContainer().getLightVehicle(index));
        } else if (str.equals("Truck")) {
            vehicle = new Truck();
            View.print(carFleet.getContainer().getTruck(index));
        } else {
            View.print("No such car type in your fleet!");
        }
        
        carFleet.removeCar(vehicle, index);
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
    
    public static void findLightCarsMass(CarFleet carFleet) {
        int mass = 0;
        int num = 0;
        
        if (carFleet.getContainer().getFix()) {
            num = carFleet.getContainer().getLightVehicleNumber() - 1;
            mass = CarFleetLogic.findLVMass(carFleet.getContainer().getLightVehiles(), num);
                
        } else {
           num = carFleet.getContainer().getLightVehicle().size() - 1;
           mass = CarFleetLogic.findLVMassDynamic(carFleet.getContainer().getLightVehicle(), num);
        }
        View.print("\n----------Total Mass of LightCars---------");
        View.print("Total mass of light cars in your fleet is: " + mass + " kilos");
    }
    
    private static int findLVMass(LightVehicle[] lightVehicles, int num) {
        
        if (num == 0)
            return lightVehicles[num].getMass();
        
        return lightVehicles[num].getMass() + findLVMass(lightVehicles, --num);
    }
    
    private static int findLVMassDynamic(ArrayList<LightVehicle> lightVehicles, int num) {
        if (num == 0)
            return lightVehicles.get(num).getMass();
        
        return lightVehicles.get(num).getMass() + findLVMassDynamic(lightVehicles, --num);
    }       
}
