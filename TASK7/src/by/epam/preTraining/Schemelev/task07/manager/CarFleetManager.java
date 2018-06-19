package by.epam.preTraining.Schemelev.task07.manager;

import by.epam.preTraining.Schemelev.task07.model.CarFleet;
import by.epam.preTraining.Schemelev.task07.container.*;

public class CarFleetManager {
    private static final boolean FIXED = true;
    private static final boolean NOT_FIXED = false;
    
    private static int userLightVehicleNumber = 10;
    private static int userTruckNumber = 5;
    
    private static CarFleet userCarFleet;
    private static Container userContainer;
    
    public static CarFleet makeCarFleet() { 
        userContainer = new Container(FIXED, userLightVehicleNumber, userTruckNumber);
        userContainer.randomizeContainer();
        userCarFleet = new CarFleet(userContainer);
        
        return userCarFleet;
    }
   
}
