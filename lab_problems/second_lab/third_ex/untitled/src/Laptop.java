public class Laptop extends ElectricalGadget{
    private int RAM;
    private int ROM;

    public Laptop(int V, String CPU, int r, int hard){
        super(V, CPU);
        this.RAM = r;
        this.ROM = hard;
    }
    public Boolean isBetter(Laptop other){
        return this.RAM > other.RAM & this.ROM > other.ROM;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public String toString(){
        return "This laptop uses a "+this.getProcessorID()+"and has "+this.ROM+"Gb ROM and "+this.RAM+"Gb Ram";
    }

}
