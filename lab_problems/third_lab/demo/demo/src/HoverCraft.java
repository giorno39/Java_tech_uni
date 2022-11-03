public class HoverCraft extends Vehicle implements IsSeaVessel, IsLandVehicle{
    int passengers;

    public HoverCraft(int speed, String mod, double money, int ppl){
        super(speed, mod, money);
        this.passengers = ppl;
    }

    @Override
    public double checkPromo() {
        double oldPrice = this.getPrice();
        double newPrice = oldPrice - (oldPrice * 0.03);
        return newPrice;
    }

    @Override
    public void enterLand() {
        System.out.println("Can enter land");
    }

    @Override
    public void enterSea() {
        System.out.println("Can enter sea");
    }
}
