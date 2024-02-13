package models;

import Interfaces.IInspect;

public abstract class StructureType implements IInspect {
    private String inputName;
    private int numberOfFloors;
    private double areaOfStructure;

    public StructureType (String name){
        this.inputName = name;
    }
    public String infoOfBuilding(){
        return "This is a " + this.inputName;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getAreaOfStructure() {
        return areaOfStructure;
    }

    public void setAreaOfStructure(double areaOfStructure) {
        this.areaOfStructure = areaOfStructure;
    }

    public String inspect(boolean hasBeenInspected){
        return this.getInputName() + " has been inspected which is " + hasBeenInspected;
    }



}


