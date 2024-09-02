import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DeviceDA {
    ArrayList<Device> deviceList;

    DeviceDA() throws FileNotFoundException {
        deviceList = new ArrayList<>();
        Device device;

        Scanner sc = new Scanner(new FileReader("Device.csv"));

        while (sc.hasNext()) {
            device = new Device();
            device.setDeviceName(sc.nextLine());
            deviceList.add(device);
        }
    }

    public ArrayList<Device> getDeviceList() {
        return deviceList;
    }
}
