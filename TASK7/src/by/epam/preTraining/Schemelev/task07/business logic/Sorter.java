package by.epam.preTraining.Schemelev.task07.businesslogic;

import by.epam.preTraining.Schemelev.task07.model.CarFleet;
import by.epam.preTraining.Schemelev.task07.model.Truck;
import by.epam.preTraining.Schemelev.task07.util.View;
import java.util.ArrayList;

public class Sorter {
    final static int HALF = 2;
    final static int MIN_NUMBER_OF_VEHICLES_TO_SORT = 2;
    
    public static void sortTruckByCapacityAsc(CarFleet carFleet) {
        
        int size = carFleet.getContainer().getTruckNumber();
        if (size > MIN_NUMBER_OF_VEHICLES_TO_SORT) {
            Truck newTruck = new Truck();
            
            if (carFleet.getContainer().getFix()) {
                Truck[] newTrucks = new Truck[size];
                
                for (int i = 0; i < size; i++) {
                    newTrucks[i] = carFleet.getContainer().getTruck(i);
                }
                
                for (int i = size - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (newTrucks[j].getMaxCapacity() > newTrucks[j + 1].getMaxCapacity()) {
                            newTruck = newTrucks[j];
                            newTrucks[j] = newTrucks[j + 1];
                            newTrucks[j + 1] = newTruck;
                        }
                    }
                }  
                View.print("\n-------------Trucks by capacity-----------");
                for (int i = 0; i < size; i++) {
                    View.print(newTrucks[i]);
                }
            } else {
                ArrayList<Truck> newTrucks = new ArrayList<Truck>();
                for (int i = 0; i < size; i++) {
                    newTrucks.add(carFleet.getContainer().getTruck(i));
                }
            
                for (int i = size - 1; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (newTrucks.get(j).getMaxCapacity() > newTrucks.get(j + 1).getMaxCapacity()) {
                            newTruck = newTrucks.get(j + 1);
                            newTrucks.set(j, newTrucks.get(j + 1));
                            newTrucks.set(j + 1, newTruck);
                        }
                    }
                }
                View.print("\n-------------Trucks by capacity-----------");
                for (Truck truck : newTrucks) {
                    View.print(truck);
                }
            }    
        }
    }
}
