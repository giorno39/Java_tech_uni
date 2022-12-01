import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Services extends Update_files{
    Scanner scan = new Scanner(System.in);
    ArrayList<Device> devices = new ArrayList<Device>();
    Queue<BrokenDevice> brokenDevices = new LinkedList<BrokenDevice>();

    public void addNewDevice(Device dev){
        this.devices.add(dev);
        updateDevices(this.devices);
    }

    public void requestForBroken(Device dev, String symptom){
        BrokenDevice currDev = new BrokenDevice(dev.getBrand(), dev.getModel(), dev.getPrice(), symptom, 1);
        this.devices.remove(dev);
        this.brokenDevices.add(currDev);
        updateBrokenDevices(this.brokenDevices);
        updateDevices(this.devices);
    }

    public void repairDevice(){
        BrokenDevice currDev = this.brokenDevices.poll();
        Device repiredDev = new Device(currDev.getBrand(), currDev.getModel(), currDev.getPrice());
        this.devices.add(repiredDev);
        updateBrokenDevices(this.brokenDevices);
        updateDevices(this.devices);
    }

    public void getDevicesWithSymptom(String symptom){
        for(BrokenDevice currDev: this.brokenDevices){
            String currSymptom = currDev.getSymptoms();
            if(currSymptom.equals(symptom)){
                System.out.println(currDev.toString());
            }
        }
    }

    public double getAllPrices(){
        double sum = 0;
        for(BrokenDevice currDev: this.brokenDevices){
            sum += currDev.getPrice();
        }
        for(Device currDev: this.devices){
            sum += currDev.getPrice();
        }

        return sum;
    }

    public double getProfit(){
        double profit = 0;
        for(BrokenDevice currDev: this.brokenDevices){
            profit += currDev.getPrice() * 0.1;
        }
        return profit;
    }

    public void addDevice(){
        Device.createDevice(this.scan);
    }

    public void addBrokenDevice(){
        BrokenDevice.createDevice(this.scan);
    }


    public void printDevices(){
        for(Device currDev: this.devices){
                System.out.println(currDev.toString());
            }
        }

    public void printBrokenDevices(){
        for(BrokenDevice currDev: this.brokenDevices){
            System.out.println(currDev.toString());
        }
    }
}

