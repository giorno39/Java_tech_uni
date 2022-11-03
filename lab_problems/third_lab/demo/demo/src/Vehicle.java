public abstract class Vehicle {
    private int maxSpeed = 0;
    private String model = "";
    private double price = 0;

    public Vehicle(int speed, String mod, double money){
        this.maxSpeed = speed;
        this.model = mod;
        this.price = money;
    }

    public abstract double checkPromo();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
