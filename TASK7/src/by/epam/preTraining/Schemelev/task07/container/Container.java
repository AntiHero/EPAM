package by.epam.preTraining.Schemelev.task07.container;

import by.epam.preTraining.Schemelev.task07.model.*;
import by.epam.preTraining.Schemelev.task07.util.Randomizer;
import java.util.ArrayList;


public class Container {
    private boolean fixed = true;
    
    private LightVehicle[] lightVehicles;
    private Truck[] trucks;

    private ArrayList<LightVehicle> lightCars;
    private ArrayList<Truck> heavyCars;

    private String[] lightVehicleMakes = { "BMW 740i", "BMW 330d", "BMW 525i", "BMW M3", "BMW M5", "BMW X6", "BMW X3",
                                            "AUDI A6", "AUDI A3", "AUDI A4", "AUDI TT", "AUDI Q6", "VW Polo", 
                                            "VW Getta", "VW Passat B3", "VW Toureg", "VW Tiguan", "Opel Corso", 
                                            "Opel Astra", "Toyota Camry", "Toyota Corolla", "Hundai Solaris",
                                            "Mitsubishi Lancer", "Lada X-Ray", "Lada NIVA", "Lada Granta", 
                                            "Moskvich 412", "Nissan Patrol", "Nissan Almera", "Jeep Grand Cherokee",
                                            "Mercedes-Benz W201", "Mercedes=Benz CLK", "Mercedes-Benz W205"};
    
    private String[] truckMakes = {"MAN", "Iveco", "Isuzu", "MAZ", "GAZ", "DUFF", "Dempster", "Dodge", "Chrysler",
                                    "Ford", "Buick", "Hummer", "GMC" };
 
    private String[] luxuryClass = {"C-class", "E-class", "D-class", "S-class", "F-class"};
    
    private int truckNumber;
    private int lightVehicleNumber;

    public Container(boolean fixed, int lightVehicleNumber, int truckNumber) {
        this.fixed = fixed;
        this.lightVehicleNumber = lightVehicleNumber;
        this.truckNumber = truckNumber;
        
        if (fixed) {
            lightVehicles = new LightVehicle[lightVehicleNumber];
            trucks = new Truck[truckNumber];
        } else {
            lightCars = new ArrayList<LightVehicle>();
            heavyCars = new ArrayList<Truck>();
        }
    }

    public Container() {
        this.truckNumber = 0;
        this.lightVehicleNumber = 0;
    }

    public void setTruckNumber(int size) {
        truckNumber = size;
    }

    public int getTruckNumber() {
        return truckNumber;
    }
    
    public void setLightVehicleNumber(int size) {
        lightVehicleNumber = size;
    }
    
    public int getLightVehicleNumber() {
        return lightVehicleNumber;
    }
    
    public LightVehicle getLightVehicle(int index) {
        return lightVehicles[index];
    }
    
    public void setLightVehicle(LightVehicle lightVehicle, int index) {
        lightVehicles[index] = lightVehicle;
    }
     
    public Truck getTruck(int index) {
        return trucks[index];
    }
    
    public void setTruck(Truck truck, int index) {
        trucks[index] = truck;
    }
    
    public ArrayList<LightVehicle> getLightVehicle() {
        return lightCars;
    }
    
    public void setLightVehicleDynamic(LightVehicle lightVehicle) {
        lightCars.add(lightVehicle);
    }
    
    public void removeLightVehicleDynamice(int index) {
        lightCars.remove(index);
    }
    
    public void clearLightVehicleDynamic() {
        lightCars.clear();
    }
    
    public ArrayList<Truck> getTruck() {
        return heavyCars;
    }
    
    public void setTruckDynamic(Truck truck) {
        heavyCars.add(truck);
    }
    
    public void removeTruckDynamic(int index) {
        heavyCars.remove(index);
    }
    
    public void clearTruckDynamic() {
        heavyCars.clear();
    }
    
    public LightVehicle[] getLightVehiles() {
        return lightVehicles;
    }
    
    public Truck[] getTrucks() {
        return trucks;
    }

    public boolean getFix() {
        return fixed;
    }

    public void randomizeContainer() {
        if (fixed) {
            for (int i = 0; i < lightVehicleNumber; i++) {
                this.lightVehicles[i] = new LightVehicle(lightVehicleMakes[Randomizer.makeRandString(lightVehicleMakes)],
                                                            luxuryClass[Randomizer.makeRandString(luxuryClass)],
                                                                Randomizer.makeRandInRange(LightVehicle.getMinMass(), 
                                                                                           LightVehicle.getMaxMass()));                                                  
            }
            for (int i = 0; i < truckNumber; i++) {
                this.trucks[i] = new Truck(truckMakes[Randomizer.makeRandString(truckMakes)],
                                                Randomizer.makeRandInRange(Truck.getMinTruckCapacity(), Truck.getMaxTruckCapacity()),
                                                    Randomizer.makeRandInRange(Truck.getMinMass(), Truck.getMaxMass()));
                                                
            }
        } else {
            this.lightCars.add(new LightVehicle(lightVehicleMakes[Randomizer.makeRandString(lightVehicleMakes)],
                                                    luxuryClass[Randomizer.makeRandString(luxuryClass)],
                                                        Randomizer.makeRandInRange(LightVehicle.getMinMass(), 
                                                                                   LightVehicle.getMaxMass()))); 

            this.heavyCars.add(new Truck(truckMakes[Randomizer.makeRandString(truckMakes)],
                                    Randomizer.makeRandInRange(Truck.getMinTruckCapacity(), Truck.getMaxTruckCapacity()),
                                        Randomizer.makeRandInRange(Truck.getMinMass(), Truck.getMaxMass())));
        }

    }
    
   

}
