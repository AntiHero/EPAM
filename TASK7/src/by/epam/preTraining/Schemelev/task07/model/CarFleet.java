package by.epam.preTraining.Schemelev.task07.model;

import by.epam.preTraining.Schemelev.task07.container.Container;

public class CarFleet {

    private Container userContainer;

    public CarFleet() {
        userContainer = new Container();
    }

    public CarFleet(Container userContainer) {
        this.userContainer = userContainer;
    }
    
    public Container getContainer() {
        return this.userContainer;
    }
    
    public void setContainer(Container newContainer) {
        userContainer = newContainer;
    }

    public void addCar(Vehicle vehicle) {
        if (userContainer.getFix()) {
            if (vehicle instanceof LightVehicle) {
                for (int i = 0; i < userContainer.getLightVehicleNumber(); i++) {
                    if (userContainer.getLightVehicle(i) == null) {
                        userContainer.setLightVehicle((LightVehicle) vehicle, i);
                    }
                }
            } else if (vehicle instanceof Truck) {
                for (int i = 0; i < userContainer.getTruckNumber(); i++) {
                    if (userContainer.getTruck(i) == null) {
                        userContainer.setTruck((Truck) vehicle, i);
                    }
                }
            }
        } else {
            if (vehicle instanceof LightVehicle) {
                userContainer.setLightVehicleDynamic((LightVehicle)vehicle);
            } else if (vehicle instanceof Truck) {
                userContainer.setTruckDynamic((Truck)vehicle);
            }
        }
    }
    
    public void addCars(int number, Vehicle vehicle) {
        if (userContainer.getFix()) {
            if (vehicle instanceof LightVehicle) {
                outerloop:
                for (int i = 0; i < userContainer.getLightVehicleNumber();) {
                    if (userContainer.getLightVehicle(i) == null) {
                        for (int index = 0; index < number; index++)
                            userContainer.setLightVehicle((LightVehicle) vehicle, index);
                    }
                    break outerloop;
                }
            } else if (vehicle instanceof Truck) {
                outerloop:
                for (int i = 0; i < userContainer.getTruckNumber();) {
                    if (userContainer.getTruck(i) == null) {
                        for (int index = 0; index < number; index++)
                            userContainer.setTruck((Truck) vehicle, i + index);
                    }
                    break outerloop;
                }
            }
        } else {
            if (vehicle instanceof LightVehicle) {
                for (int index = 0; index < number; index++) {
                    userContainer.setLightVehicleDynamic((LightVehicle)vehicle);
                }
            } else if (vehicle instanceof Truck) {
                for (int index = 0; index < number; index++) {
                    userContainer.setTruckDynamic((Truck)vehicle);
                }
            }
        }
    }

    public void removeCar(Vehicle vehicle, int index) {
        if (userContainer.getFix()) {
            if (vehicle instanceof LightVehicle) {
                userContainer.setLightVehicle(null, index);
            } else if (vehicle instanceof Truck) {
                userContainer.setTruck(null, index);
            }
        } else {
            if (vehicle instanceof LightVehicle) {
                userContainer.removeLightVehicleDynamice(index);
            } else if (vehicle instanceof Truck) {
                userContainer.removeTruckDynamic(index);
            }
        }
    }
    
    public void removeCars () {
        if (userContainer.getFix()) {
            for (int i = 0; i < userContainer.getLightVehicleNumber(); i++) {
                userContainer.setLightVehicle(null, i);
            }
            
            for (int i = 0; i < userContainer.getTruckNumber(); i++) {
                userContainer.setTruck(null, i);
            }
        } else {
           userContainer.clearLightVehicleDynamic();
           userContainer.clearTruckDynamic();
        }
    }
}
