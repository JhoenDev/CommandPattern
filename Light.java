import java.util.Scanner;

public class Light extends Device implements Command {

    boolean status = false;
    int brightness = 50;

    @Override
    public void execute() {

        boolean loop = true;
        while (loop) {
            System.out.println("\nLight [" + deviceName + "] is turned " + (status ? "on" : "off") + ".");
            if (status) {
                System.out.println("Brightness:\t" + brightness + "%");
            }

            System.out.println("\n[1] Turn " + (status ? "off" : "on"));

            if (status) {
                System.out.println("[2] Increase Brightness");
                System.out.println("[3] Decrease Brightness");
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
                    incBri();
                    break;

                case 3:
                    decBri();
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
        System.out.println("\nLight is turned on.");
    }

    @Override
    public void off() {
        this.status = false;
        System.out.println("\nLight is turned off.");
    }

    public void incBri() {
        if (this.brightness == 100) {
            System.out.println("\nLight brightness is max.");
            return;
        }

        this.brightness = this.brightness + 5;
        ;
        System.out.println("\nLight brightness set to " + brightness + "%.");
    }

    public void decBri() {
        if (this.brightness == 0) {
            System.out.println("\nLight brightness is at lowest.");
            return;
        }

        this.brightness = this.brightness - 5;
        ;
        System.out.println("\nLight brightness set to " + brightness + "%.");
    }

}
