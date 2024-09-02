public class Device {
    String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void execute() {
        System.out.println("Device is now Working.");
    }
}
