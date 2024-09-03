import java.util.Scanner;

public class Thermostat extends Device implements Command {
    boolean status = false;
    int temperature = 25;
    int fanSpeed = 1;

    @Override
    public void execute() {

        boolean loop = true;
        while (loop) {

            System.out.println("\nThermostat [" + deviceName + "] is turned " + (status ? "on" : "off") + ".");
            if (status) {
                System.out.println("Temperature:\t" + temperature + "C");
                System.out.println("Fan Speed:\t" + fanSpeed);
            }

            System.out.println("\n[1] Turn " + (status ? "off" : "on"));

            if (status) {
                System.out.println("[2] Increase Temperature");
                System.out.println("[3] Decrease Temperature");
                System.out.println("[4] Increase Fan Speed");
                System.out.println("[5] Decrease Fan Speed");
            }

            System.out.print("[0] Back\n : ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    if (status)
                        off();
                    else
                        on();
                    break;

                case 2:
                    incTemp();
                    break;

                case 3:
                    decTemp();
                    break;

                case 4:
                    incfSpd();
                    break;

                case 5:
                    decfSpd();
                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    break;
            }
        }

    }

    @Override
    public void on() {
        this.status = true;
        System.out.println("\nThermostat is turned on.");
    }

    @Override
    public void off() {
        this.status = false;
        System.out.println("\nThermostat is turned off.");
    }

    public void incTemp() {
        if (this.temperature == 50) {
            System.out.println("\nTemperature is at max.");
            return;
        }

        this.temperature = this.temperature + 5;
        ;
        System.out.println("\nTemperature set to " + temperature + "C.");
    }

    public void decTemp() {
        if (this.temperature == 10) {
            System.out.println("\nTemperature is at lowest.");
            return;
        }

        this.temperature = this.temperature - 5;
        ;
        System.out.println("\nTemperature set to " + temperature + "C.");
    }

    public void incfSpd() {
        if (this.fanSpeed == 3) {
            System.out.println("\nFan Speed is at max.");
            return;
        }

        this.fanSpeed = this.fanSpeed + 1;
        ;
        System.out.println("\nFan Speed set to " + fanSpeed + ".");
    }

    public void decfSpd() {
        if (this.fanSpeed == 0) {
            System.out.println("\nFan is off.");
            return;
        }

        this.fanSpeed = this.fanSpeed - 1;
        ;
        System.out.println("\nFan Speed set to " + fanSpeed + ".");
    }

}
