public class Car extends Vehicle implements IsLandVehicle {
    int kWPower;

    public Car(int speed, String mod, double money, int kw) {
        super(speed, mod, money);
        this.kWPower = kw;
    }


    @Override
    public double checkPromo() {
        double oldPrice = this.getPrice();
        double newPrice = oldPrice - (oldPrice * 0.2);
        return newPrice;
    }

    @Override
    public void enterLand() {
        System.out.println("Represents an F1 car");
    }
}


