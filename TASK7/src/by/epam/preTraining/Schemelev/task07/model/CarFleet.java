package by.epam.preTraining.Schemelev.task07.model;

import by.epam.preTraining.Schemelev.task07.container.Container;

public class CarFleet {

    private Container userContainer;

    public CarFleet() {
        this.userContainer = new Container();
    }

    public CarFleet(Container userContainer) {
        this.userContainer = userContainer;
    }
    
    public Container getContainer() {
        return this.userContainer;
    }
    
    public void setContainer(Container newContainer) {
        this.userContainer = newContainer;
    }
    
    public int setContainer(int b) {
        return 0;
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
                userContainer.addLightVehicleDynamic((LightVehicle)vehicle);
            } else if (vehicle instanceof Truck) {
                userContainer.addTruckDynamic((Truck)vehicle);
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
                            if (userContainer.getLightVehicle(i + index) != null) {
                            userContainer.setLightVehicle((LightVehicle) vehicle, i + index);
                            } else break outerloop;
                    }
                }
            } else if (vehicle instanceof Truck) {
                outerloop:
                for (int i = 0; i < userContainer.getTruckNumber();) {
                    if (userContainer.getTruck(i) == null) {
                        for (int index = 0; index < number; index++)
                            if (userContainer.getTruck(i + index) != null) {
                                userContainer.setTruck((Truck) vehicle, i + index);
                            } else break outerloop;
                    }
                }
            }
        } else {
            if (vehicle instanceof LightVehicle) {
                for (int index = 0; index < number; index++) {
                    userContainer.addLightVehicleDynamic((LightVehicle)vehicle);
                }
            } else if (vehicle instanceof Truck) {
                for (int index = 0; index < number; index++) {
                    userContainer.addTruckDynamic((Truck)vehicle);
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
                userContainer.removeLightVehicleDynamic(index);
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
