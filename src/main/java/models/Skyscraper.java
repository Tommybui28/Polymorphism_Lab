package models;

import Interfaces.IInspect;

public class Skyscraper extends StructureType implements IInspect {

    private boolean hasElevator;

    public Skyscraper(String name, boolean hasElevator) {
        super(name);
        this.hasElevator = hasElevator;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    @Override
    public int getNumberOfFloors(){
        return 256;
    }
    public String inspect(boolean hasBeenInspected){
        return this.getInputName() + " has been inspected which is " + hasBeenInspected;
    }

}

