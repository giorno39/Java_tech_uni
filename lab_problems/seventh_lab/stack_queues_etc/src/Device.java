import java.util.Scanner;

public class Device {
    private String brand;
    private String model;
    private double price;



    public Device(){
        this.brand = "";
        this.model = "";
        this.price = 0.0;
    }

    public Device(String brand, String model, double price){
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public static Device  createDevice(Scanner scan){
        String brand;
        String model;
        double price;

        System.out.println("Enter the brand of the device");
        brand = scan.nextLine();
        System.out.println("Enter the model of the device");
        model = scan.nextLine();
        System.out.println("Enter the price of the device");
        price = scan.nextDouble();

        Device new_device = new Device(brand,model, price);
        return new_device;
    }

    @Override
    public String toString() {
        return this.getBrand() + this.getModel() + "has no symptoms";
    }

}


