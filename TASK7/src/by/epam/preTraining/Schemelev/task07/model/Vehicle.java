package by.epam.preTraining.Schemelev.task07.model;

public class Vehicle {
    
    private int mass;
    private String make;
    
    public Vehicle(){
    }
    
    {
        mass = 2500;
        make = "Jeely";
    }
    
    public Vehicle (int i) {
        
    }
    public int getMass() {
        return mass;
    }
    
    public void setMass(int vehicleMass) {
        mass = vehicleMass;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String vehicleMake) {
        make = vehicleMake;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((make == null) ? 0 : make.hashCode());
        result = prime * result + mass;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (make == null) {
            if (other.make != null)
                return false;
        } else if (!make.equals(other.make))
            return false;
        if (mass != other.mass)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Vehicle's make: " + make + ", mass: " + mass;
    }
    
}
