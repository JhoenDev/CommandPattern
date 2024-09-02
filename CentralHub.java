import java.io.FileNotFoundException;
import java.util.Scanner;

public class CentralHub {
    public CentralHub() throws FileNotFoundException {

        boolean loop = true;
        while (loop) {
            System.out.println("\n[1] Select Device");
            System.out.println("[2] Add Device");
            System.out.print("[3] Exit\n : ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    selectDevice();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    break;
            }
        }

    }

    public void selectDevice() throws FileNotFoundException {
        DeviceDA devices = new DeviceDA();

        for (int i = 0; i < devices.getDeviceList().size(); i++) {
            System.out.println("[" + (i + 1) + "]" + " " + devices.getDeviceList().get(i).getDeviceName());
        }
        System.out.print(" : ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                devices.getDeviceList().get(input - 1).execute();
                break;
            default:
                break;
        }
    }

    public void addDevice() {
    }
}
