package by.epam.preTraining.Schemelev.task07.instances;

public class Vehicle {

    private int mass;
    private String make;

    {
        mass = 2500;
        make = "Jeely";
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

}
