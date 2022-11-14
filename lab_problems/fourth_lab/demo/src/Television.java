public class Television extends Goods implements ElectricalAppliance {
    String model;
    String brand;
    double power;
    public Television(){
        this.model = "";
        this.brand = "";
        this.power = 0;
        try{
            this.setPrice(0);
        }catch (PriceException e){
            e.getMessage();
        }
        this.setNumber("");
    }

    public Television(String model, String brand, double power, double price, String number) throws PriceException {
        super(price, number);
        this.model = "model";
        this.brand = "brand";
        this.power = power;

        this.setNumber("");
    }

    @Override
    public double CalcConsumption(int time) throws PowerException {
        double curr_power = time * this.power;
        if(curr_power > 10000){
            throw new PowerException();
        }
        return curr_power;
    }

    @Override
    public void checkPromo(double discount) throws PriceException {
        double curr_price = this.getPrice();
        double new_price = curr_price - (curr_price * discount);
        this.setPrice(new_price);
    }
}
