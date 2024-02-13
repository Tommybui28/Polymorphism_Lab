package models;

import java.util.ArrayList;

public class BuildingManager {
    private ArrayList<StructureType> structureTypes;

    public BuildingManager() {
        this.structureTypes = new ArrayList<StructureType>();
    }

    public int countStructureTypes(){
        return this.structureTypes.size();
    }
    public void canAddStructure (StructureType structureType){
        this.structureTypes.add(structureType);
    }

    public ArrayList<StructureType> getStructureTypes() {
        return structureTypes;
    }

    public void setStructureTypes(ArrayList<StructureType> structureTypes) {
        this.structureTypes = structureTypes;
    }
}
