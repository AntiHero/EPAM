package by.epam.preTraining.Schemelev.task07.main;

import by.epam.preTraining.Schemelev.task07.businesslogic.CarFleetLogic;
import by.epam.preTraining.Schemelev.task07.manager.CarFleetManager;
import by.epam.preTraining.Schemelev.task07.model.*;

public class Main {
    public static void main(String[] args) {
        
        CarFleet MyOwnFleet;
        
        MyOwnFleet = CarFleetManager.makeCarFleet();
        
        CarFleetLogic.showCars(MyOwnFleet);
        CarFleetLogic.findSportCars(MyOwnFleet);
        CarFleetLogic.findTruckWithMaxCapacity(MyOwnFleet);
        
        LightVehicle Moskvich408 = new LightVehicle("Moskvich 408", "B-class", 2300);
        CarFleetLogic.addCar(Moskvich408, MyOwnFleet);
        
        CarFleetLogic.clearCarFleet(MyOwnFleet);
        CarFleetLogic.showCars(MyOwnFleet);
    }

}
