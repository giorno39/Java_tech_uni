import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Queue;

public class Update_files {
    public static void updateDevices(ArrayList<Device> devices) {
        for(Object currDev: devices){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./devices.ser"))) {
            out.writeObject(currDev);
            out.flush();
            out.close();
        } catch (IOException e) {
            System.err.println("Problem with serialization: " + e.getMessage());

            }
        }
    }

    public static void updateBrokenDevices(Queue<BrokenDevice> brokenDevices) {
        for(Object currDev: brokenDevices){
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./brokendevices.ser"))) {
                out.writeObject(currDev);
                out.flush();
                out.close();
            } catch (IOException e) {
                System.err.println("Problem with serialization: " + e.getMessage());

            }
        }
    }
}