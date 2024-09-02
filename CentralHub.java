import java.util.Scanner;
import java.io.*;

public class CentralHub {
    public CentralHub() throws IOException {

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
                case 2:
                    addDevice();
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

    public void addDevice() throws IOException, FileNotFoundException {
        Device device;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect Type of Device: ");
        System.out.println("[1] Tv");
        System.out.print("[0] Back\n : ");
        int input = sc.nextInt();
        sc.nextLine();

        System.out.print("\nType Device Name: ");
        String name = sc.nextLine();

        switch (input) {
            case 1:
                device = new Tv();
                device.setDeviceName(name);

                // write to csv
                Writer writer = new FileWriter(new File("Device.csv"), true);
                writer.write(name);
                writer.flush();

                // success message
                System.out.print("\nNew Device Successfully Added.");
                break;
            case 0:
                return;
            default:
                break;
        }

    }
}
