import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DeviceDA {
    static ArrayList<Device> deviceList = new ArrayList<>();;

    DeviceDA() throws FileNotFoundException {
        if (deviceList.equals(null) || (deviceList.isEmpty())) {

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
    }

    public static ArrayList<Device> getDeviceList() {
        return deviceList;
    }
}
