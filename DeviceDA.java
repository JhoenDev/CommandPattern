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

            String[] line = sc.nextLine().split(",");
            switch (line[0]) {
                case "t":
                    device = new Tv();
                    break;
                default:
                    device = new Device();
            }
            device.setDeviceName(line[1]);
            deviceList.add(device);
        }
    }

    public ArrayList<Device> getDeviceList() {
        return deviceList;
    }
}
