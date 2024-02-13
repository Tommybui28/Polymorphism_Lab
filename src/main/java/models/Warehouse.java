package models;

import models.StructureType;

public class Warehouse extends StructureType {

    private double storageCapacity;
    private boolean controlTemperature;

    public Warehouse(String name, double storageCapacity, boolean controlTemperature) {
        super(name);
        this.controlTemperature = controlTemperature;
        this.storageCapacity = storageCapacity;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean isControlTemperature() {
        return controlTemperature;
    }

    public void setControlTemperature(boolean controlTemperature) {
        this.controlTemperature = controlTemperature;
    }
}
