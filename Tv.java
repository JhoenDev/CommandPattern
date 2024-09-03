import java.util.*;

public class Tv extends Device implements Command {
    boolean status = false;
    int volume = 50;
    int brightness = 50;

    @Override
    public void execute() {

        boolean loop = true;
        while (loop) {
            System.out.println("\nTv [" + deviceName + "] is turned " + (status ? "on" : "off") + ".");
            if (status) {
                System.out.println("Volume: " + volume + "%");
                System.out.println("Brightness: " + brightness + "%");
            }

            System.out.println("\n[1] Turn " + (status ? "off" : "on"));

            if (status) {
                System.out.println("[2] Increase Volume");
                System.out.println("[3] Decrease Volume");
                System.out.println("[4] Increase Brightness");
                System.out.println("[5] Decrease Brightness");
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
                    incVol();
                    break;

                case 3:
                    decVol();
                    break;

                case 4:
                    incBri();
                    break;

                case 5:
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
        System.out.println("\nTv is turned on.");
    }

    @Override
    public void off() {
        this.status = false;
        System.out.println("\nTv is turned off.");
    }

    public void incVol() {
        // System.out.println("tv vol: " + this.volume + " tv bri: " + this.brightness);

        if (this.volume == 100) {
            System.out.println("\nTv volume is max.");
            return;
        } else {
            this.volume = this.volume + 5;
            System.out.println("\nTv volume increased to " + this.volume + "%.");
        }

    }

    public void decVol() {
        if (this.volume == 0) {
            System.out.println("\nTv is muted.");
            return;
        }

        this.volume = this.volume - 5;
        System.out.println("\nTv volume decreased to " + this.volume + "%.");
    }

    public void incBri() {
        if (this.brightness == 100) {
            System.out.println("\nTv brightness is max.");
            return;
        }

        this.brightness = this.brightness + 5;
        System.out.println("\nTv brightness increased to " + this.brightness + "%.");
    }

    public void decBri() {
        if (this.brightness == 0) {
            System.out.println("\nTv brightness is at lowest.");
            return;
        }

        this.brightness = this.brightness - 5;
        ;
        System.out.println("\nTv brightness decreased to " + this.brightness + "%.");
    }

}
