import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BrokenDevice extends Device{
    private String symptoms;
    private int days;

    public BrokenDevice(String brand, String model, double price, String symptoms, int days){
        super(brand, model, price);
        setDays(days);
        setSymptoms(symptoms);
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static Device  createDevice(Scanner scan){
        String brand;
        String model;
        double price;
        String symptoms;
        int days;

        System.out.println("Enter the brand of the device");
        brand = scan.nextLine();
        System.out.println("Enter the model of the device");
        model = scan.nextLine();
        System.out.println("Enter the price of the device");
        price = scan.nextDouble();
        scan.nextLine();
        System.out.println("What are the symptoms of the device");
        symptoms = scan.nextLine();
        System.out.println("How many days will be needed to fix them");
        days = scan.nextInt();


        BrokenDevice new_device = new BrokenDevice(brand, model, price, symptoms, days);
        return new_device;
    }

    @Override
    public String toString() {
        return this.getBrand() + this.getModel() + "has this "+ this.symptoms;
    }
}

