public class ElectricalGadget {
    private int neededElectricalSupply;
    private String processorID;

    private Boolean isWorking = false;

    public ElectricalGadget(int V, String CPU){
        this.neededElectricalSupply = V;
        this.processorID = CPU;
    }

    public void turnOn(){
        if(this.isWorking){
            System.out.println("This gadget is already ON");
        }
        this.isWorking = true;
    }

    public void turnOff(){
        if(!this.isWorking){
            System.out.println("This gadget is already OFF");
        }
        this.isWorking = false;
    }


    public String getProcessorID() {
        return processorID;
    }

    public void setProcessorID(String processorID) {
        this.processorID = processorID;
    }

    public int getNeededElectricalSupply() {
        return neededElectricalSupply;
    }

    public void setNeededElectricalSupply(int neededElectricalSupply) {
        this.neededElectricalSupply = neededElectricalSupply;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }
}
