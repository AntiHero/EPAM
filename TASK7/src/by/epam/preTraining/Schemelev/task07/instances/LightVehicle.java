package by.epam.preTraining.Schemelev.task07.instances;

public class LightVehicle extends Vehicle {
    private String luxuryClass;
    CarFleet carFleet;

    public LightVehicle(int mass, String make, String luxuryClass) {
        if (mass <= 0 || mass >= 3500) {
            this.setMass(3499);
        }

        if (make.equals(" ")) {
            this.setMake("Jeely");
        }

        if (!luxuryClass.equals("Business class") || !luxuryClass.equals("Budget class")) {
            this.setLuxuryClass("Budget class");
        } else if (luxuryClass.equals("Business class")) {
            CarFleet.setLuxuryCars(1);
        } else {
            CarFleet.setLuxuryCars(0);
        }

        setMass(mass);
        setMake(make);

    }

    public String getLuxuryClass() {
        return luxuryClass;
    }

    public void setLuxuryClass(String Class) {
        luxuryClass = Class;
    }

}
