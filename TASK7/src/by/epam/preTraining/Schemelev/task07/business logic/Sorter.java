package by.epam.preTraining.Schemelev.task07.businesslogic;

import by.epam.preTraining.Schemelev.task07.model.CarFleet;
import by.epam.preTraining.Schemelev.task07.model.Truck;
import by.epam.preTraining.Schemelev.task07.util.View;
import java.util.ArrayList;

class Sorter {
    final static int HALF = 2;
    final static int MIN_NUMBER_OF_VEHICLES_TO_SORT = 2;

    public static void sortTrucksByCapacityAsc(CarFleet carFleet) {

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

    public static void sortTrucksByMassAscInsertionSort(CarFleet carFleet) {
        int size = carFleet.getContainer().getTruckNumber();
        if (size > MIN_NUMBER_OF_VEHICLES_TO_SORT) {
            Truck newTruck = new Truck();
            int key = 0;
            int j = 0;

            if (carFleet.getContainer().getFix()) {
                for (int i = 1; i < size; i++) {
                    key = carFleet.getContainer().getTruck(i).getMass();
                    j = i - 1;
                    while (j >= 0 && key < carFleet.getContainer().getTruck(j).getMass()) {
                        newTruck = carFleet.getContainer().getTruck(j);
                        carFleet.getContainer().setTruck(carFleet.getContainer().getTruck(j + 1), j);
                        carFleet.getContainer().setTruck(newTruck, j + 1);
                        j--;
                    }
                }

                View.print("\n---------------Trucks by mass-------------");
                for (int i = 0; i < size; i++) {
                    View.print(carFleet.getContainer().getTruck(i));
                }
            } else {
                for (int i = 1; i < size; i++) {
                    key = carFleet.getContainer().getTruck().get(i).getMass();
                    j = i - 1;
                    while (j >= 0 && key < carFleet.getContainer().getTruck().get(j).getMass()) {
                        newTruck = carFleet.getContainer().getTruck().get(j);
                        carFleet.getContainer().setTruckDynamic(carFleet.getContainer().getTruck().get(j + 1), j);
                        carFleet.getContainer().setTruckDynamic(newTruck, j + 1);
                        j--;
                    }
                }
                View.print("\n-------------Trucks by mass-----------");
                for (Truck truck : carFleet.getContainer().getTruck()) {
                    View.print(truck);
                }
            }
        }
    }

    public static void sortTrucksByMassAscSelectionSort(CarFleet carFleet) {
        int size = carFleet.getContainer().getTruckNumber();
        if (size > MIN_NUMBER_OF_VEHICLES_TO_SORT) {
            Truck newTruck = new Truck();
            int minIndex = 0;
            int minValue = 0;

            if (carFleet.getContainer().getFix()) {
                for (int i = 0; i < size; i++) {
                    minValue = carFleet.getContainer().getTruck(i).getMass();
                    minIndex = i;
                    
                    for (int j = i; j < size; j++) {
                        if (carFleet.getContainer().getTruck(j).getMass() < minValue) {
                            minValue = carFleet.getContainer().getTruck(j).getMass();
                            minIndex = j;
                        }
                    }
                    if (minValue < carFleet.getContainer().getTruck(i).getMass()) {
                        newTruck = carFleet.getContainer().getTruck(i);
                        carFleet.getContainer().setTruck(carFleet.getContainer().getTruck(minIndex), i);
                        carFleet.getContainer().setTruck(newTruck, minIndex);
                    }
                }

                View.print("\n---------------Trucks by mass-------------");
                for (int i = 0; i < size; i++) {
                    View.print(carFleet.getContainer().getTruck(i));
                }
            } else {
                for (int i = 0; i < size; i++) {
                    minValue = carFleet.getContainer().getTruck().get(i).getMass();
                    minIndex = i;
                    
                    for (int j = i; j < size; j++) {
                        if (carFleet.getContainer().getTruck().get(j).getMass() < minValue) {
                            minValue = carFleet.getContainer().getTruck().get(j).getMass();
                            minIndex = j;
                        }
                    }
                    if (minValue < carFleet.getContainer().getTruck().get(i).getMass()) {
                        newTruck = carFleet.getContainer().getTruck().get(i);
                        carFleet.getContainer().setTruckDynamic(carFleet.getContainer().getTruck().get(minIndex), i);;
                        carFleet.getContainer().setTruckDynamic(newTruck, minIndex);
                    }          
                }
                View.print("\n-------------Trucks by mass-----------");
                for (Truck truck : carFleet.getContainer().getTruck()) {
                    View.print(truck);
                }
            }
        }
    }
    
    public static void sortTrucksByMassAscMergeSort(CarFleet carFleet) {
        int size = carFleet.getContainer().getTruckNumber();
        if (size > MIN_NUMBER_OF_VEHICLES_TO_SORT) {
            if (carFleet.getContainer().getFix()) {
                Truck[] newTrucks = new Truck[size];
                
                for (int i = 0; i < size; i++) {
                    newTrucks[i] = carFleet.getContainer().getTruck(i);
                }

                newTrucks = mergeSort(newTrucks);
                
                for (int i = 0; i < size; i++) {
                    carFleet.getContainer().setTruck(newTrucks[i], i);
                }       
            }
            View.print("\n---------------Trucks by mass-------------");
            for (int i = 0; i < size; i++) {
                View.print(carFleet.getContainer().getTruck(i));
            }
        }
    }
    
    
    private static Truck[] mergeSort(Truck[] trucks) {
        if (trucks.length <= 1) {
            return trucks;
        }
        
        int size = trucks.length;
        int middle = size / 2;

        Truck[] leftArray = new Truck[middle];
        Truck[] rightArray;
        
        if (trucks.length % 2 == 0) {
            rightArray = new Truck[middle];
        } else {
            rightArray = new Truck[middle + 1];
        }
        
        Truck[] sortedTrucks = new Truck[trucks.length];
             
        for (int i = 0; i < middle; i++) {
            leftArray[i] = trucks[i];
        }
        
        int j = 0;    
        for (int i = middle; i < trucks.length; i++) {
            
            if (j < rightArray.length) {
                rightArray[j] = trucks[i];
                j++;
            }
        }
        
        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        
        
        sortedTrucks =  merge(leftArray, rightArray);
        
        return sortedTrucks;
    }
    
    private static Truck[] merge(Truck[] left, Truck[] right) {
        
        int lengthResult = left.length + right.length;
        Truck[] trucks = new Truck[lengthResult];
        
        int indexL = 0;
        int indexR = 0;
        int indexRes = 0;
        
        while (indexL < left.length || indexR < right.length) {
            if (indexL < left.length && indexR < right.length) {
                if (left[indexL].getMass() < right[indexR].getMass()) {
                    trucks[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
                } else {
                    trucks[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }        
            } else if (indexL < left.length) {
                trucks[indexRes] = left[indexL];
                indexL++;
                indexRes++;
            } else if (indexR < right.length) {
                trucks[indexRes] = right[indexR];
                indexR++;
                indexRes++;
            }   
        }
        return trucks;
    }
}
