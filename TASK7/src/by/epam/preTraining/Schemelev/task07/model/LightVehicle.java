package by.epam.preTraining.Schemelev.task07.model;

public class LightVehicle extends Vehicle {
    final private int LIGHT_VEHICLE_MAX_MASS = 3500;
    final private int LIGHT_VEHICLE_MIN_MASS = 1100;
    
    private String luxuryClass;
    
    public LightVehicle(int mass, String make, String luxuryClass) {
        if (mass <= LIGHT_VEHICLE_MIN_MASS || mass > LIGHT_VEHICLE_MAX_MASS) {
            this.setMass(2020);
        }

        if (make.equals("")) {
            this.setMake("Jeely");
        }
        
        if (luxuryClass.equals("")) {
            this.luxuryClass = "B-Class";
        }

        setMass(mass);
        setMake(make);
        System.out.println("LightVehicle with args");
    }
    
    public LightVehicle(LightVehicle copy) {
        LightVehicle newVehicle = new LightVehicle();
        
        newVehicle.setMass(copy.getMass());
        newVehicle.setMake(copy.getMake());
        newVehicle.setLuxuryClass(copy.getLuxuryClass());
        
        System.out.println("LightVehicle copy constructor");
       
    }
    
    public LightVehicle() {
        System.out.println("LightVehicle with no args");
        
    }
    
    public LightVehicle copyLightVehicle() {
        return new LightVehicle(this);
    }
    
    public String getLuxuryClass() {
        return luxuryClass;
    }

    public void setLuxuryClass(String Class) {
        luxuryClass = Class;
    }
    
    public int getMaxMass() {
        return LIGHT_VEHICLE_MAX_MASS;
    }
    
    public int getMinMass() {
        return LIGHT_VEHICLE_MIN_MASS;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (luxuryClass == null ? 0 : luxuryClass.hashCode());
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
        if (obj instanceof LightVehicle) {
            LightVehicle testCar = (LightVehicle) obj;
            if (!testCar.luxuryClass.equals(this.luxuryClass)) {
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
        return ("Make: " + this.getMake() + "Clas: " + luxuryClass + "Mass: " + this.getMass());
    }

}
