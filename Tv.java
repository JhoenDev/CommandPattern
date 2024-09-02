import java.util.*;

public class Tv extends Device implements Command {
    boolean status = false;
    int volume = 50;
    int brightness = 50;

    @Override
    public void execute() {
        System.out.println("\nTv is turned " + (status ? "on" : "off") + ".");

        boolean loop = true;
        while (loop) {
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
        if (this.volume == 100) {
            System.out.println("\nTv volume is max.");
            return;
        }

        this.volume = +5;
        System.out.println("\nTv volume set to " + volume + "%.");
    }

    public void decVol() {
        if (this.volume == 0) {
            System.out.println("\nTv is muted.");
            return;
        }

        this.volume = -5;
        System.out.println("\nTv volume set to " + volume + "%.");
    }

    public void incBri() {
        if (this.brightness == 100) {
            System.out.println("\nTv brightness is max.");
            return;
        }

        this.brightness = +5;
        System.out.println("\nTv brightness set to " + volume + "%.");
    }

    public void decBri() {
        if (this.brightness == 0) {
            System.out.println("\nTv brightness is at lowest.");
            return;
        }

        this.brightness = -5;
        System.out.println("\nTv brightness set to " + volume + "%.");
    }

}
