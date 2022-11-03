public class Ship extends Vehicle implements IsSeaVessel {
    double deadweight;

    public Ship(int speed, String mod, double money, double weight) {
        super(speed, mod, money);
        this.deadweight = weight;
    }


    @Override
    public double checkPromo() {
        double oldPrice = this.getPrice();
        double newPrice = oldPrice - (oldPrice * 0.003);
        return newPrice;
    }

    @Override
    public void enterSea() {
        System.out.println("Can Enter Sea");
    }
}


