package by.epam.preTraining.Schemelev.task07.main;

import by.epam.preTraining.Schemelev.task07.businesslogic.*;
import by.epam.preTraining.Schemelev.task07.manager.CarFleetManager;
import by.epam.preTraining.Schemelev.task07.model.*;

public class Main {
    final static String car = "LightVehicle";
    final static String truck = "Truck";
    
    public static void main(String[] args) {
        
        CarFleet MyOwnFleet;
        
        MyOwnFleet = CarFleetManager.makeCarFleet();
        
        CarFleetLogic.showCars(MyOwnFleet);
        CarFleetLogic.findSportCars(MyOwnFleet);
        CarFleetLogic.findTruckWithMaxCapacity(MyOwnFleet);
        CarFleetLogic.removeCar(MyOwnFleet, car, 0);
        
        LightVehicle Moskvich408 = new LightVehicle("Moskvich 408", "B-class", 2300);
        CarFleetLogic.addCar(Moskvich408, MyOwnFleet);
        
        //CarFleetLogic.clearCarFleet(MyOwnFleet);
        //CarFleetLogic.showCars(MyOwnFleet);
        
        CarFleetLogic.showCars(MyOwnFleet);
        
        CarFleetLogic.findLightCarsMass(MyOwnFleet);
        
        CarFleetLogic.sortTrucksByCapacity(MyOwnFleet);
        
        //CarFleetLogic.sortTruckByMassInsertion(MyOwnFleet);
        //CarFleetLogic.sortTruckByMassSelection(MyOwnFleet);
        CarFleetLogic.removeCar(MyOwnFleet, truck, 0);
        
        Truck MAZ = new Truck("MAZ", 60500, 13400);
        CarFleetLogic.addCar(MAZ, MyOwnFleet);
        
        CarFleetLogic.sortTruckByMassMerge(MyOwnFleet);
        CarFleetLogic.searchCarByMass(MyOwnFleet, 13400);
    }

}
