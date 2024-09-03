import java.util.Scanner;
import java.io.*;

public class CentralHub {

    public CentralHub() throws IOException {
        new DeviceDA();

        boolean loop = true;
        while (loop) {
            System.out.println("\n[1] Select Device");
            System.out.println("[2] Add Device");
            System.out.print("[0] Exit\n : ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    selectDevice();
                    break;
                case 2:
                    addDevice();
                    break;
                case 0:
                    loop = false;
                    System.out.print("\nExiting Program. -Jullien Jhoen Alban");
                    break;
                default:
                    break;
            }
        }

    }

    public void selectDevice() throws FileNotFoundException {

        System.out.println("\nDevices: ");
        for (int i = 0; i < DeviceDA.getDeviceList().size(); i++) {
            System.out.println("[" + (i + 1) + "]" + " " + DeviceDA.getDeviceList().get(i).getDeviceName());
        }
        System.out.print(" : ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        DeviceDA.getDeviceList().get(input - 1).execute();

    }

    public void addDevice() throws IOException, FileNotFoundException {
        Device device;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect Type of Device: ");
        System.out.println("[1] Tv");
        System.out.println("[2] Light");
        System.out.println("[3] Thermostat");
        System.out.print("[0] Back\n : ");
        int input = sc.nextInt();
        sc.nextLine();

        System.out.print("\nType Device Name: ");
        String name = sc.nextLine();

        Writer writer = new FileWriter(new File("Device.csv"), true);

        switch (input) {
            case 1:
                device = new Tv();
                device.setDeviceName(name);
                DeviceDA.deviceList.add(device);

                writer.write("t," + name + "\n");
                writer.flush();
                break;

            case 2:
                device = new Light();
                device.setDeviceName(name);
                DeviceDA.deviceList.add(device);

                writer.write("l," + name + "\n");
                writer.flush();
                break;

            case 3:
                device = new Thermostat();
                device.setDeviceName(name);
                DeviceDA.deviceList.add(device);

                writer.write("th," + name + "\n");
                writer.flush();
                break;

            case 0:
                return;

            default:
                break;
        }
        // success message
        System.out.println("\nNew Device Successfully Added.");

    }
}
