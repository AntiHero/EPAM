package by.epam.preTraining.Schemelev.task07.businesslogic;

import by.epam.preTraining.Schemelev.task07.model.CarFleet;
import by.epam.preTraining.Schemelev.task07.util.View;

class Search {
    public static int searchTruckMassBinary(CarFleet carFleet, int search) {
        
        int index = -1;
        int first = 0;
        int last = carFleet.getContainer().getLightVehicleNumber() - 1;

        int middle = 0;

        View.print("\nYou are searching for a truck with mass:" + search + " kilos!");

        while (first <= last) {
            middle = (first + last) / 2;

            if (carFleet.getContainer().getTruck(middle).getMass() == search) {
                return middle; 
            } else if (carFleet.getContainer().getTruck(middle).getMass() > search) {
                last = middle - 1;
            } else if (carFleet.getContainer().getTruck(middle).getMass() < search) {
                first = middle + 1;
            }
        }
        return index;
    }
    
      public static int searchTruckCapacityLinear(CarFleet carFleet, int search) {
        int pos = 0;
        
        while (pos < carFleet.getContainer().getTruckNumber()) {
            if (carFleet.getContainer().getTruck(pos).getMaxCapacity() == search) {
                return pos;
            }
        }
        return -1;
    }
}
