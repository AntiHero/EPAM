package by.epam.preTraining.Schemelev.task07.instances;

public class Truck extends Vehicle {
    private int maxCapacity;

    public Truck(int mass, String make, int maxCapacity) {
        if (mass < 3500) {
            this.setMass(3500);
        }

        if (make.equals(" ")) {
            this.setMake("MAZ");
        }

        setMass(mass);
        setMake(make);

        if (maxCapacity <= 1000) {
            System.out.println("Wrong capacity!");
        } else {
            this.maxCapacity = maxCapacity;
        }
    }

    public int getmaxCapacity() {
        return maxCapacity;
    }

    public void setLuxuryClass(int capacity) {
        maxCapacity = capacity;
    }

}
