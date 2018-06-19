package by.epam.preTraining.Schemelev.task07.model;

public class Truck extends Vehicle {
    final private int TRUCK_MIN_MASS = 3500;
    final private int TRUCK_MAX_MASS = 25000;
    final private int TRUCK_MIN_CAPACITY = 1000;
    final private int TRUCK_MAX_CAPACITY = 70000;
    
    private int maxCapacity;
    
    public Truck(int mass, String make, int maxCapacity) {
        if (mass < TRUCK_MIN_MASS || mass > TRUCK_MAX_MASS) {
            this.setMass(3600);
        }

        if (make.equals("")) {
            this.setMake("MAZ");
        }

        setMass(mass);
        setMake(make);

        if (maxCapacity <= TRUCK_MIN_CAPACITY || maxCapacity >= TRUCK_MAX_CAPACITY) {
            System.out.println("Wrong capacity!");
            this.maxCapacity = 10000;
        } else {
            this.maxCapacity = maxCapacity;
        }
        System.out.println("Truck with args");
    }
    
    public Truck() {
        setMass(3600);
        setMake("MAZ");
        setMaxCapacity(10000);
        
    }
    
    public Truck(Truck copy) {
        Truck newVehicle = new Truck();
        
        newVehicle.setMass(copy.getMass());
        newVehicle.setMake(copy.getMake());
        newVehicle.setMaxCapacity(copy.getMaxCapacity());
        
        System.out.println("Truck copy constructor");
    }
    
    public Truck copyTruck() {
        return new Truck(this);
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }
    
    public int getMaxMass() {
        return TRUCK_MAX_MASS;
    }
    
    public int getMinMass() {
        return TRUCK_MIN_MASS;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maxCapacity;
        result = prime * result + this.getMass();
        result = prime * result + ((this.getMake() == null)? 0 : this.getMake().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof Truck) {
            Truck testCar = (Truck) obj;
            if (testCar.maxCapacity != this.maxCapacity) {
                return false;
            }
            
            if (testCar.getMass() != this.getMass()) {
                return false;
            }
            
            if (!testCar.getMake().equals(this.getMake())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return ("Make: " + this.getMake() + "MaxCapacity: " + maxCapacity + "Mass: " + this.getMass());
    }
    
   


}
