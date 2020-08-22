package Composition;

public class MotorBoard {
    private String model;
    private String manufacture;
    private int ramSlots;
    private int carSlots;
    private String bios;

    public MotorBoard(String model, String manufacture, int ramSlots, int carSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println ("program " + programName + "is now loading .... ");

    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public String getBios() {
        return bios;
    }
}
