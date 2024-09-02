import java.util.*;

public class Tv extends Device implements Command {
    boolean status = false;
    int volume = 50;
    int brightness = 50;

    @Override
    public void execute() {
        System.out.println("Tv is turned " + (status ? "on" : "off") + ".");

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
        System.out.println("Tv is turned on.");
    }

    @Override
    public void off() {
        this.status = false;
        System.out.println("Tv is turned off.");
    }

}
